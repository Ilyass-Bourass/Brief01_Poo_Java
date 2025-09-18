package Repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Hotel;

public class InMemoryHotelRepository implements HotelRepository {
    private Map<String,Hotel> hotels;
    
    public InMemoryHotelRepository(){
        hotels = new HashMap<>();
    }

    @Override
    public void addHotel(String id , Hotel hotel){
        hotels.put(id,hotel);
    }

    @Override
    public boolean removeHotel(String id){
       return hotels.remove(id) !=null;
    }

    @Override 
    public Hotel findById(String id){
        return hotels.get(id);
    }

    @Override
    public Collection <Hotel> findAll(){
        return hotels.values();
    }
}
