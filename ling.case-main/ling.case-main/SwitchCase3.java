package switchcase;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args){
          short ventiladorLigado = 0;
        boolean continuar = true;
        Scanner scnLigarVentilador = new Scanner(System.in);
        Scanner scnProsseguir = new Scanner(System.in);
        String ligarVentilador;

        while (continuar == true) {
            switch (ventiladorLigado) {
                case 0:
                    System.out.println("Ventilador desligado. Deseja ligar?");
                    ligarVentilador = scnLigarVentilador.nextLine().toUpperCase();
                    if (ligarVentilador.equals("SIM")) {
                        ventiladorLigado = 1;
                    }
                    break;
                case 1:
                    System.out.println("Ventilador ligado. Deseja desligar?");
                    ligarVentilador = scnLigarVentilador.nextLine().toUpperCase();
                    if (ligarVentilador.equals("SIM")) {
                        ventiladorLigado = 0;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja prosseguir?");
            String prosseguir = scnProsseguir.nextLine().toUpperCase();
            if (prosseguir.equals("NAO")) {
                System.out.println("Ok. Saindo...");
                continuar = false;
                break;
            }
        }
         }
}
