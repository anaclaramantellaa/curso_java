package foreach;

import java.util.Scanner;

public class ForEach1 {
    public static void main(String[] args){
        String[] cores = {"azul", "amarelo", "vermelho", "roxo", "cinza", "preto", "verde", "rosa", "branco"};
        Scanner scnCor = new Scanner(System.in);

        for (short c = 0; c < cores.length; c++) {
            System.out.println("Cor [ " + c + " ] - " + cores[c]);
        }

        System.out.println("Digite o código de uma cor acima: ");
        short cor = scnCor.nextShort();

        switch (cor) {
            case 0:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 1:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 2:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 3:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 4:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 5:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 6:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 7:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
            case 8:
                System.out.println("Você selecionou a cor " + cores[cor]);
                break;
        
            default:
            System.out.println("Ops! Cor inválida.");
                break;
        }
         }
}
