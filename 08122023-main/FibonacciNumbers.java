package JavaX;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.awt.Color;
import java.util.concurrent.ExecutionException;

public class FibonacciNumbers 
{
    //Componentes para calcular o número de Fibonacci inserido pelo usuário
    private final JPanel workerJPanel =
        new JPanel(new GridLayout(2,2,5,5));
    private final JTextField numberJTextField = new JTextField();
    private final JButton goJButton = new JButton("Go");
    private final JLabel fibonJLabel = new JLabel();

    //componentes e variáveis para obter o próximo número de Fibonacci
    private final JPanel eventThreadJPanel =
        new JPanel(new GridLayout(2,2,5,5));
    private long n1 = 0; //inicializa com o primeiro número de Fibonacci
    private long n2 = 1; //inicializa com o segundo número de Fibonacci
    private int count = 1; //número de Fibonacci atual para exibir
    private final JLabel nJLabel = new JLabel("Fibonacci of 1: ");
    private final JLabel nFibonacciJLabel =
        new JLabel(String.valueOf(n2));
    private final JButton nextNumberJButton = 
        new JButton("Next Number");

    //construtor
    public FibonacciNumbers()
    {
        super("Fibonacci Numbers");
        setLayout(new GridLayout(2,1,10,10));

        //adiciona componentes GUI ao painel SwingWorker
        worJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLACK), "Whit SwingWorker"));
        worJPanel.add(new JLabel("Get Fibonacci of: "));
        worJPanel.add(numberJTextField);
        goJButton.addActionListener(
          new ActionListener() 
          {
            public void actionPerformed(ActionEvent event)
            {
                int n;

                try
                {
                    //recupera a entrada do usuário com um inteiro
                    n = Integer.parseInt(numberJTextField.getText());
                }
                catch(NumberFormatException ex)
                {
                    //exibe uma mensagem de erro se o usuário não inseriu um número inteiro
                    nFibonacciJLabel.setText("Enter an integer");
                    return;
                }

                //indica que o calculo começou
                nFibonacciJLabel.setText("Calculating...");

                //cria uma tarefa para realizar o cálculo em segundo plano
                BackgroundCalculator task =
                    new BackgroundCalculator(n, nFibonacciJLabel);
                task.execute(); //executa a tareda
            }
          } //fim da classe interna anônima
        ); //fim da chamada para AddActionListener
        workerJPanel.add(goJButton);
        workerJPanel.add(nFibonacciJLabel);

        //adiciona componentes GUI ao painel da thread de despacho de eventos
        eventThreadJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLACK), "Without SwingWorker"));
        eventThreadJPanel.add(nJLabel);
        eventThreadJPanel.add(nFibonacciJLabel);
        nextNumberJButton.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent event)
                {
                    //calcula o número de Fibonacci após n2
                    long temp = n1 + n2;
                    n1 = n2;
                    n2 = temp;
                    ++count;

                    //exibe o próximo número de Fibonacci
                    nJLabel.setText("Fibonacci of" + count + ": ");
                    nFibonacciJLabel.setText(String.valueOf(n2));
                }
            } //fim da classe interna anônima 
        ); //fim da chamada para addActionListener
        eventThreadJPanel.add(nextNumberJButton);

        add(workerJPanel);
        add(eventThreadJPanel);
        setSize(275, 200);
        setVisible(true);
    } //fim do construtor

    //método main inicia a execu~ção de programa

    public static void main(String[] args)
    {
           FibonacciNumbers application = new FibonacciNumbers();
           application.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
} //fim da classe Fibonacci Numbers
