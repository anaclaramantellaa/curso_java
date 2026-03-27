package dowhile;

import java.util.*;

public class DoWhile4 {
    public static void main(String[] args) {
        String[] produtos = {"Pão (UN)","Maçã (KG)","Sabão em pó 2kg (UN)","Abacate (KG)","Coca-Cola 2L (UN)"};
        double[] precos = {0.75,8.2,19.98,5.76,8.64};
        int qtdProdutos = 0;

        List<String> produtosCarrinho = new ArrayList<>();
        List<Double> precosCarrinho = new ArrayList<>();
        List<Integer> unidadesCarrinho = new ArrayList<>();
        List<String> unStrCarrinho = new ArrayList<>();

        boolean carrinhoCheio = false;

        Scanner scnProdutos = new Scanner(System.in);
        int codScnProduto;
        Scanner scnQtdProduto = new Scanner(System.in);
        int qtdScnProd;
        Scanner scnContinuar = new Scanner(System.in);

        while (carrinhoCheio == false) {
            while (qtdProdutos < produtos.length) {
                System.out.println("Cód.: " + qtdProdutos + " - Produto: " + produtos[qtdProdutos]);
                qtdProdutos++;
            }

            System.out.println("Digite o código do produto");
            codScnProduto = scnProdutos.nextInt();
            produtosCarrinho.add(produtos[codScnProduto]);
            precosCarrinho.add(precos[codScnProduto]);

            System.out.println("Digite a quantidade desejada");
            qtdScnProd = scnQtdProduto.nextInt();
            unidadesCarrinho.add(qtdScnProd);


            if (qtdProdutos == produtos.length) {
                carrinhoCheio = true;
            }

            System.out.println("Deseja adicionar outro produto? Digite 'S' para continuar ou Digite 'N' para calcular o valor do carrinho");
            if (scnContinuar.nextLine() == "N") {
                break;
            }
        }

        scnProdutos.close();
        scnQtdProduto.close();
        scnContinuar.close();

        int qtdProdCarrinho = 0;
        double precoTotal = 0;
        String strQtdCarrinho = unidadesCarrinho.toString();
        System.out.println("Os produtos do carrinho são: ");
        while (qtdProdCarrinho < produtosCarrinho.size()) {
            System.out.println("Cód: " + qtdProdCarrinho + ", Produto: " + produtos[qtdProdCarrinho] + ", Preço: " + precos[qtdProdCarrinho] + ", Quantidade: " /*+ strQtdCarrinho[qtdProdCarrinho]*/);
            precoTotal += precos[qtdProdCarrinho];
            qtdProdCarrinho++;
        }

        System.out.println("O valor total do carrinho é de R$: " + precoTotal);
    }
}