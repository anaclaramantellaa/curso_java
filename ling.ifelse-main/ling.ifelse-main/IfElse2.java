import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite apenas número inteiro");
        int userInt = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Digite apenas número inteiro");
        int userInt2 = num2.nextInt();

        int res = (userInt + userInt2);

        if(userInt < 50){
         System.out.println("O resultado foi menor que 50 e foi de:   " + res);    
        }else {
        System.out.println("O resultado foi de: " + res);
        }
    }
}
