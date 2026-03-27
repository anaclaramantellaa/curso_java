package dowhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args){
        String[] frutas = {"Abacaxi", "Laranja", "Uva", "Melão", "Limão", "Morango"};
        int frutasVer = 0;

            while(frutasVer < frutas.length){
                System.out.println(frutas[frutasVer]);
                frutasVer++;
            }
     }
}
