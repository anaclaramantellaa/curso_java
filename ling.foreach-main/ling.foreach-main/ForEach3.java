package foreach;

import java.util.Scanner;

public class ForEach3 {
    public static void main(String[] args) {
        String[] frutas = {"Mamão", "Morango", "Laranja", "Limão", "Jabuticaba", "Uva", "Banana", "Melão", "Maçã", "Manga"};

        

        for(int i = 0; i < frutas.length ; i++) {
            System.out.println("Fruta [ " + i + " ] " + frutas[i]);
        }
        System.out.println("Escolha a sua fruta desejada: ");
        Scanner fru = new Scanner(System.in);
        int frutaDesejada = fru.nextInt();
        System.out.println("A fruta escolhida foi: " + frutas[frutaDesejada]);
    }
}   