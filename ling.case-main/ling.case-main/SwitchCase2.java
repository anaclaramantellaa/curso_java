package switchcase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args){
           String[] comodos = {"Sala","Cozinha","Quarto","Banheiro","Varanda","Garagem","Lavabo"};
        Scanner scnComodo = new Scanner(System.in);

        boolean interruptorSala = false;
        while (interruptorSala == false) {
            for (short c = 0; c < comodos.length; c++) {
                System.out.println("Cômodo [" + c + "] - " + comodos[c]);
            }
            System.out.println("Digite o número do cômodo o qual deseja acender a luz");
            short comodo = scnComodo.nextShort();
            switch (comodo) {
                case 0:
                    System.out.println("Você acertou! Acendendo a luz da sala");
                    interruptorSala = true;
                    break;
                case 1:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                case 2:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                case 3:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                case 4:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                case 5:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                case 6:
                    System.out.println("Este não é o interruptor da sala...");
                    break;
                default:
                    System.out.println("Interruptor inválido");
                    break;
            }
        }
         }
}
