package Repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import model.Hotel;

public class InMemoryHotelRepository implements HotelRepository {
    private Map<String,Hotel> hotels;
    
    public InMemoryHotelRepository(){
        hotels = new HashMap<>();
        Hotel hotel = new Hotel("1234", "belive", "adress belive",15, 5.0);
        hotels.put(hotel.getUuidHotel(),hotel);
        Hotel hotel2 = new Hotel("4567", "dream", "adress dream",45, 3.0);
        hotels.put(hotel2.getUuidHotel(),hotel2);
    }

    @Override
    public void addHotel(String id , Hotel hotel){
        hotels.put(id,hotel);
    }

    @Override
    public boolean removeHotel(String id){
       return hotels.remove(id) !=null;
    }

    public void updatHotel(String id ,Hotel hotel){
        hotels.put(id,hotel);
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
