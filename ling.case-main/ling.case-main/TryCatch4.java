package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch4 {
    public static void main(String[] args){
              try {
            Scanner scnValorDeposito = new Scanner(System.in);
            System.out.println("Digite o valor da quantia a ser depositada");
            long valorDeposito = scnValorDeposito.nextLong();

            System.out.println("O valor de R$ " + valorDeposito + " foi depositado com sucesso");
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
         }
}
