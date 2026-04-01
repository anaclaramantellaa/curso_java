package switchcase;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args){
         Scanner scnIdade = new Scanner(System.in);
        System.out.println("Digite sua idade");
        short idade = scnIdade.nextShort();

        switch (idade) {
            case 1:
                System.out.println("Prof favor dirija-se à sala 1");
                break;
            case 2:
                System.out.println("Prof favor dirija-se à sala 2");
                break;
            case 3:
                System.out.println("Prof favor dirija-se à sala 3");
                break;
            case 4:
                System.out.println("Prof favor dirija-se à sala 4");
                break;
            case 5:
                System.out.println("Prof favor dirija-se à sala 5");
                break;
            default:
                System.out.println("Idade inválida");
                break;
        }
         }
}
