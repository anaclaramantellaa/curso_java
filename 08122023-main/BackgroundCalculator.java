package JavaX;

//Figura 23.24: BackgroundCalculator.java
//Subclasse SwingWorker para calcularos números de Fibonacci
//em uma thread em segundo plano.

import javax.swing.SwingWorker;
import javax.swing.JLabel;
import java.util.concurrent.ExecutionException;

public class BackgroundCalculator extends SwingWorker<Long, Object>
{ 
    private final int n; //Número de Fibonacci a calcular
    private final JLabel resultJLabel; //JLabel para exibir o resultado

    //construtor
    public BackgroundCalculator(int n, JLabel resultJLabel)
    {
        this.n = n;
        this.resultJLabel = resultJLabel;
    }  

    //código de longa duração para ser executado em uma thread trabalhadora
    public long doInBackgroud()
    {
        long nthFib;
        return nthFib = fibonacci(n);
    }

    //códifo a ser executado na thread de despacho de eventos quando doInBacground retorna
    protected void done()
    {
        try 
        {
            //obtém o resultado de doInBacground e o exibe
            resultJLabel.setText(get().toString());
        }
        catch (InterruptedException ex)
        {
            resultJLabel.setText("Interrupted while waiting for results.");
        }
        catch (ExecutionException ex) 
        {
            resultJLabel.setText(
                "Error encountered while performing calculation");
        }
    }

    //método fibonacci recursivo; calcula o enésimo número de Fibonacci
    public long fibonacci(long number)
    {
        if (number == 0 || number == 1)
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
} //fim da classe BackgroundCalculator

