package foreach;
import java.util.*
;public class ForEach5 {
    public static void main(String[] args){
        List<String> inventario = new ArrayList<>();
        boolean terminarInventario = false;
        Scanner scnItemInventario = new Scanner(System.in);
        String itemInventario;

        while (terminarInventario == false) {
            System.out.println("Digite o nome do item que será adicionado ao inventário ou digite nao (para sair)");
            itemInventario = scnItemInventario.nextLine();
            if (itemInventario.toUpperCase().equals("NAO")) {
                terminarInventario = true;
            } else {
                inventario.add(itemInventario);
                System.out.println("Item " + itemInventario + " adicionado com sucesso.");
            }
        }

        scnItemInventario.close();

        System.out.println("Os itens adicionados ao inventário são: ");
        for (int i = 0; i < inventario.size(); i++){
            System.out.println(inventario.get(i));
        }

     }
}
