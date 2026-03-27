import java.util.*;

public class IfElse4 {
    public static void main(String[] args){
        int ano = 2023;
        System.out.println("Informe seu ano de nascimento: ");
        Scanner idade = new Scanner(System.in);
        int id1 = idade.nextInt();
        int res = ano - id1;

        if(res >= 18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }
    }

}
