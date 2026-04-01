package trycatch;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args){
      
        try{
            Double massa = 9.81;
            System.out.println("Digite seu peso: ");
            Scanner p = new Scanner(System.in);
            Double peso = p.nextDouble();

            Double semErro = peso * massa;

            System.out.println("Sua massa é de: " + semErro);
            Thread.sleep(1);
        } catch (InterruptedException e){
            System.out.println("Ops! Houve algum erro..." + e);
        }

        
         }
}
