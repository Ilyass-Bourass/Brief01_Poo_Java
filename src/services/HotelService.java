package services;

import java.util.UUID;

import Repositories.InMemoryHotelRepository;
import model.Hotel;

public class HotelService {
    
    private InMemoryHotelRepository hotelRepository;

    public HotelService(InMemoryHotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }
    public boolean ajouterHotel(String nameHotel , String AdresseHotel , int availableRooms , Double note){
        
        if(availableRooms <= 0){
            System.out.println("le nombre de chambre doit être supérieur à zéro");
            return false;
        }
        String id = UUID.randomUUID().toString();
        Hotel hotel = new Hotel(id, nameHotel, AdresseHotel, availableRooms, note);
        hotelRepository.addHotel(id,hotel);
        System.out.println("ajout de l'hotel "+nameHotel+ " se fait avec succés");
        return true;
    }

    public void afficherHotels(){
        if(hotelRepository.findAll().size() == 0){
            System.out.println("Aucun hotel dans notre systèm");
        }
        else {

            hotelRepository.findAll().forEach(System.out::println);
        }
    }

    public boolean supprimerHotel(String id){
      
        if(hotelRepository.removeHotel(id)){
            System.out.println("l'hotel à été supprimer avec succés");
            return true;
       } else {
            System.out.println("cette id n'existe pas dans la liste");
            return false;
       }

    }

    public boolean modifierHotel(String id ,String nomHotel , String adressHotel , int avialableRooms ,double note){
        if(hotelRepository.findById(id)==null){
            System.out.println("cette id n'existe pas dans le systèm");
            return false;
        }
        if(avialableRooms <=0){
            System.out.println("la modification echoué le nombre de chambre doit être supérieur à zéro");
            return false;
        }

        Hotel hotel = new Hotel(id, nomHotel, adressHotel, avialableRooms, note);
        hotelRepository.updatHotel(id,hotel);
        return true;
    }

}
