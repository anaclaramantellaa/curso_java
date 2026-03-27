import java.util.*;

public class IfElse3 {
    public static void main(String[] args){
        String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
        Scanner scanTxt1 = new Scanner(System.in);
        System.out.println("Digite uma palavra ou texto que contenha números");
        String txt1 = scanTxt1.nextLine();

        String caracterAtual;
        List<String> numEncontrados = new ArrayList<>();
        boolean achouNum = false;
        for(int i = 0; i < txt1.length(); i++){
            System.out.println("i: " + i);
            System.out.println("txt1.substring(i,i) " + txt1.substring(i, i+1));
            for(int n = 0; n < numeros.length; n++){
                System.out.println("n: " + i);
                System.out.println("números[n]: " + numeros[n]);
               caracterAtual = txt1.substring(i, i+1);
               if(caracterAtual.equals(numeros[n])){
                numEncontrados.add(numeros[n]);
                achouNum = true;
               }
            }
        }
        if(achouNum == true){
            System.out.println("Foram encontrados os números digitados a seguir: " + numEncontrados);
        }
        scanTxt1.close();
    }
}
