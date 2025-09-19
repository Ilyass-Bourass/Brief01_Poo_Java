package services;

import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import model.Hotel;
import model.Resevation;
import Repositories.InMemoryHotelRepository;
import Repositories.InMemoryReservationRepository;

public class ReservationService {

    private InMemoryReservationRepository reservationRepository;
    private InMemoryHotelRepository hotelRepository;

    public ReservationService(InMemoryReservationRepository reservationRepository , InMemoryHotelRepository hotelRepository){
        this.reservationRepository=reservationRepository;
        this.hotelRepository = hotelRepository;
    }

    public boolean ajouterResversation(String hotelId, String clientId, int nombreNuits){

      if (nombreNuits <= 0) {
            System.out.println("Nombre de nuits doit être > 0");
            return false;
        }

        Hotel hotel = hotelRepository.findById(hotelId);
        if (hotel == null) {
            System.out.println("Hôtel introuvable");
            return false;
        }

        if (hotel.getAvailableRooms() <= 0) {
            System.out.println("Aucune chambre disponible");
            return false;
        }

         String id = UUID.randomUUID().toString();
        Resevation res = new Resevation(id, Instant.now(), hotelId, clientId, nombreNuits);

       
        reservationRepository.addResevation(id, res);

        hotel.setAvailableRooms(hotel.getAvailableRooms() - 1);

        System.out.println("Réservation crée avec succès !");
        return true;
    }

    public void afficherReservations() {
        reservationRepository.findAll().forEach(System.out::println);
    }


    public void afficherReservationsClient(String id){
       List<Resevation> reservationsClient= reservationRepository.findAll().stream().filter(r->r.getClientUuid().equals(id)).collect(Collectors.toList());
       if(reservationsClient.size()==0){
            System.out.println("Aucun reservation à été efféctué");
       }else{
           System.out.println(reservationsClient);
       }
    }

    public void annulerResrvation(String idResvation ,String idClient){
          Resevation reservation = reservationRepository.findById(idResvation);
        if(reservation ==null || reservation.getClientUuid()!=idClient){
            System.out.println("Cette reservation n'appartient pas à votre liste");
        }else {
            Hotel hotel = hotelRepository.findById(reservation.getHotelUuid());
            hotel.setAvailableRooms(hotel.getAvailableRooms() +1);
            reservationRepository.removeReservation(idResvation);
            System.out.println("La réservation à été supprimer avec succée");
        }
    }

    
}
