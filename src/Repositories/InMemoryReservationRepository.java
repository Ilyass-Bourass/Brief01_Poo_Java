package Repositories;
import model.Resevation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class InMemoryReservationRepository implements ReservationRepository {
    
    private Map<String ,Resevation> reservations;

    public InMemoryReservationRepository(){
        reservations = new HashMap<>();
    }


    @Override
     public void addResevation(String id ,Resevation reservation){
        reservations.put(id,reservation);
    }

    @Override
    public boolean removeReservation(String id){
        return reservations.remove(id) != null ;
    }

    @Override
    public Resevation findById(String id){
        return reservations.get(id);
    }

    
    @Override
    public Collection <Resevation> findAll(){
        return reservations.values();
    }
}
