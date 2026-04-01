package projetos;

import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args){
        String[] produtos = {"pneu","cortiça","sacolinha","madeira","latinha","bambu","cabo usb","canudo de papel","nylon","canudo de plástico","DVD"};
        String[] produtosBiodegradaveis = {"cortiça", "madeira", "bambu", "canudo de papel"};
        String[] produtosNaoBiodegradaveis = {"pneu", "sacolinha", "latinha", "cabo usb", "canudo de plástico", "nylon", "canudo de plástico", "DVD"};
        boolean achouBiodegradavel = false;
 
        System.out.println("Lista de produtos: "); 

        for(short i = 0; i < produtos.length; i++) {
        System.out.println( produtos[i]);
        }

        Scanner escolha = new Scanner(System.in);
        System.out.println("Qual item deseja? " );
        String escolhaUsuario = escolha.nextLine();

        for(short b = 0; b < produtosBiodegradaveis.length; b++) {
            //System.out.println(escolhaUsuario);
            //System.out.println(produtosBiodegradaveis[b]);
            //System.out.println(produtosBiodegradaveis[b]);
            if(escolhaUsuario.equals(produtosBiodegradaveis[b])) {
              achouBiodegradavel = true;
              
            }
        }
        if(achouBiodegradavel){
            System.out.println("Você escolheu produtos biodegradáveis!! Obrigada por ajudar nosso planeta!");
        } else {
             System.out.println("Você escolheu produtos não biodegradáveis, faça uma melhor escolha na próxima!");
                 for(short n = 0; n < produtosNaoBiodegradaveis.length; n++) {
                    //System.out.println(produtosNaoBiodegradaveis[n]);
                }
        }
       
        
    }

}
