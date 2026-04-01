package switchcase;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args){
        String[] cores = {"Azul","Amarelo","Marrom","Vermelho","Verde"};
        Scanner scnCor = new Scanner(System.in);
        for (short c = 0; c < cores.length; c++) {
            System.out.println("Cor [" + c + "] - " + cores[c]);
        }
        System.out.println("Digite o número da cor selecionada");
        short cor = scnCor.nextShort();

        switch (cor) {
            case 0:
                System.out.println("Você selecionou a cor " + cores[0]);
                break;
            case 1:
                System.out.println("Você selecionou a cor " + cores[1]);
                break;
            case 2:
                System.out.println("Você selecionou a cor " + cores[2]);
                break;
            case 3:
                System.out.println("Você selecionou a cor " + cores[3]);
                break;
            case 4:
                System.out.println("Você selecionou a cor " + cores[4]);
                break;
            default:
                System.out.println("Ops! Cor não encontrada.");
                break;
        }
        scnCor.close();
         }
}
