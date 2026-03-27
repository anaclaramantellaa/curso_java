import java.util.*;

public class IfElse5 {
    public static void main(String[] args){
        int alturaM = 100;
        
        System.out.println("Digite uma altura: ");
        Scanner altu2 = new Scanner (System.in);
        int a1 = altu2.nextInt();

         if(a1 >= alturaM){
            System.out.println("Altura excedente!");
         }else{
            System.out.println("Altura ok!!");
         }
    }
}
