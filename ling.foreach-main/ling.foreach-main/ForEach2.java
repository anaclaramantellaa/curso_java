package foreach;

import java.util.*;

public class ForEach2 {
        public static void main(String[] args){
                     
        String[] nomes = {"Fiona", "Sherek", "Hércules", "Minions", "Barbie", "Bob esponja", "Pica-Pau"}; {
        Random sort = new Random();
        int aleat = sort.nextInt(7);

        for( int i = 0; i < 7; i++) {
        System.out.println("Os nomes da lista são: " + nomes[i]);
 }
        System.out.println("O nome sorteado foi: " + nomes[aleat]);
                }       
             }
}