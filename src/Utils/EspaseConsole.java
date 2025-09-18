package Utils;

import Repositories.InMemoryClientRepository;
import Repositories.InMemoryHotelRepository;
import model.User;
import services.AuthService;
import services.HotelService;

import java.util.Scanner;

public class EspaseConsole {
    
    public static void espaseEntree(){
        Scanner choice = new Scanner(System.in);

        AuthService authService = new AuthService(new InMemoryClientRepository());
        int number;
        do {

            System.out.println("========================================");
            System.out.println("      Système de Réservation Hôtel      ");
            System.out.println("========================================");
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 : Inscription");
            System.out.println("2 : Connexion");
            System.out.println("3 : afficher les utilsateurs");
            System.out.println("4: tester user current");
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

                    String role ="client";
                    authService.inscription(fuLLName, email, password, role);
                    authService.afficherUtilisateurs();

                    break;
                case 2:
                    System.out.println("email : ");
                    String emailLogin =choice.nextLine();
                    System.out.println("password: ");
                    String passwordLogin =choice.nextLine();
                    authService.login(emailLogin, passwordLogin);
                    break;
                case 3 : 
                    System.out.println("la liste des utilsateurs");
                    authService.afficherUtilisateurs();
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

    public static void espaseClient(User currentUser){
        Scanner choice = new Scanner(System.in);
        int number;
        do {
            System.out.println("========================================");
            System.out.println("            Espace Client               ");
            System.out.println("========================================");
            System.out.println(currentUser.toString());
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 : Modifier le profil");
            System.out.println("2 : Faire une réservation");
            System.out.println("3 : Annuler une réservation");
            System.out.println("4 : Consulter mes réservations");
            System.out.println("5 : Déconnexion");
            System.out.print("Votre choix : ");

            number = choice.nextInt();
            choice.nextLine(); 
            System.out.println("----------------------------------------");


            switch (number) {
                case 1-> {
                    System.out.println("Modifier le profil");
                }
                    
                case 2-> {
                    System.out.println("Faire une réservation");
                }
                case 3-> {
                    System.out.println("Annuler une réservation");
                }

                case 4-> {
                    System.out.println("consulter mes réservations");
                }

                case 5-> {
                    System.out.println(">> Merci d'avoir utilisé notre système. Au revoir !");
                    EspaseConsole.espaseEntree();
                }
                case 0-> {
                    System.out.println(">> Merci d'avoir utilisé notre système notre client. Au revoir !");
                    EspaseConsole.espaseEntree();
                }

                default-> {
                    System.out.println("votre choix est incorrecte");
                }
            }
        }while(number != 0);
        choice.close();
    }

    public static void espaseAdmin(User currentUser){
        Scanner choice = new Scanner(System.in);
        HotelService hotelService = new HotelService(new InMemoryHotelRepository());
        int number;
        do {
            System.out.println("========================================");
            System.out.println("             Espace Admin               ");
            System.out.println("========================================");
            System.out.println("1: la liste des hotels");
            System.out.println("2: la listes des utilsateurs");
            System.out.println("3: Ajouter un hotel");
            System.out.println("4: Supprimer un hotel");
            System.out.println("5: Modifier un hotel");
            System.out.println("6: Voir historique des réservation");
            System.out.println("0: Déconnexion");
            System.out.println("Votre choix : ");
            number = choice.nextInt();
            choice.nextLine();
            System.out.println("----------------------------------------");

            switch (number) {
                case 1 -> {
                    hotelService.afficherHotels();
                }

                case 2 -> {
                    System.out.println("la liste des utilsateurs");
                }

                case 3 -> {
                    System.out.println("ajoute un hotel");
                    System.out.print("nom hotel : ");
                    String nameHotel= choice.nextLine();

                    System.out.print("Adress hotel : ");
                    String adressHotel = choice.nextLine();

                    System.out.print("le nombre de chambres: ");
                    int availableRooms =choice.nextInt();
                    choice.nextLine();

                    System.out.print("la note de hotel :");
                    double note = choice.nextDouble();
                    choice.nextLine();

                    //System.out.println("nam:" + nameHotel+ "adress hotel : "+ adressHotel+ "nombre chambre :"+availableRooms+ "la note: "+note);
                    hotelService.ajouterHotel(nameHotel, adressHotel, availableRooms, note);
                }

                case 4 -> {
                    System.out.println("supprimer un hotel");
                }

                case 5 -> {
                    System.out.println("modifier un hotel");
                }

                case 6 -> {
                    System.out.println("voir l'historique");
                }

                case 0-> {
                    System.out.println(">> Merci d'avoir utilisé notre système notre admin. Au revoir !");
                    EspaseConsole.espaseEntree();
                }
            
                default-> {
                    System.out.println("erreur de number");
                }
            }
        }while(number !=0);
        choice.close();
    }

}


