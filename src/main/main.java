package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        int number;
       do {

            System.out.println("========================================");
            System.out.println("      Système de Réservation Hôtel      ");
            System.out.println("========================================");
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 : Inscription");
            System.out.println("2 : Connexion");
            System.out.println("0 : Quitter");
            System.out.print("Votre choix : ");

            number = choice.nextInt();
            System.out.println("----------------------------------------");

            switch (number) {
                case 1:
                    System.out.println(">> Vous avez choisi l'inscription");
                    break;
                case 2:
                    System.out.println(">> Vous avez choisi la connexion");
                    break;
                case 0:
                    System.out.println(">> Merci d'avoir utilisé notre système. Au revoir !");
                    break;
                default:
                    System.out.println(">> Choix invalide, veuillez réessayer.");
                    break;
            }

            System.out.println(); 
        } while (number != 0);
        choice.close();
     }
}
