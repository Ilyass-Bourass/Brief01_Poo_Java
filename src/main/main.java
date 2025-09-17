package main;

import java.util.Scanner;

import services.AuthService;
import Repositories.InMemoryClientRepository;

public class main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        
        AuthService authService = new AuthService(new InMemoryClientRepository());
        authService.inscription("admin","admin@gmail.com", "poiuytr1", "admin");
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
            choice.nextLine();
            System.out.println("----------------------------------------");

            switch (number) {
                case 1:
                    System.out.print("full Name : ");
                    String fuLLName =choice.nextLine();

                    System.out.print("email : ");
                    String email =choice.nextLine();

                    System.out.print("password: ");
                    String password =choice.nextLine();

                    String role ="user";
                    authService.inscription(fuLLName, email, password, role);
                    authService.afficherUtilisateurs();

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
