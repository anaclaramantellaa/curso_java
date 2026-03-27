package dowhile;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int maxUsers = 2;
        String usuario;
        int usersLogged = 0;
        Scanner us = new Scanner (System.in);

        while ( usersLogged < maxUsers ) {
            try {
                System.out.println("Digite seu login:");
                usuario = us.nextLine();
                usersLogged++;
                Thread.sleep(1000);
                System.out.println("Foram logados  " + usersLogged + " usuários!!");
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e);
            }
        }

        us.close();
     }
}
