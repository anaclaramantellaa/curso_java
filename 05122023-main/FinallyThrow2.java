package finallythrow;

import java.util.*;

public class FinallyThrow2 {
 
    public static void sairDoFilme(String sair) {
        if (sair.toUpperCase().equals("SAIR!!")) {
            throw new ArithmeticException("Saindo do filme..."); //chamando uma nova saída que o java entende como uma excessão aritmética
        } else {
            System.out.println("Continuando filme");
        }
    }   

    public static void verificarFilme(int tempo) {
        try {
            Thread.sleep(1000);
            System.out.println("Assistindo filme. Já se passaram " + tempo + "minutos.");
        } catch (InterruptedException e) {
                    System.out.println("Ops! Houve um erro " + e);
        } finally {
            System.out.println("Acabou o finally do método verificarFilme()");
        }
        System.out.println("Depois do finally do método verificarFilme()");
    }
    public static void main(String[] args) {
        try {
            int tempoFilme = 2;
            int inicio = 0;
            System.out.println("Filme iniciou...");
            Scanner scnSair = new Scanner(System.in);
            while(inicio < tempoFilme) { 
                verificarFilme(inicio);
                inicio++;
                System.out.println("Deseja continuar assistindo o filme? Digite /*sair/ e tecle Enter para sair.");
                sairDoFilme(scnSair.nextLine().toUpperCase());
                }
            System.out.println("Fim de filme!");
            scnSair.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro " + e);
        } finally {
            System.out.println("Acabou finally do método main() construtor.");
        }
        System.out.println("Depois do finally do método main() construtor.");
    }
}