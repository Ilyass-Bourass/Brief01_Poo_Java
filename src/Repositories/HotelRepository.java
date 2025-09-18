package Repositories;

import java.util.Collection;

import model.Hotel;

public interface HotelRepository {

    void addHotel(String id , Hotel hotel);
    boolean removeHotel(String id);
    Hotel findById(String id);
    Collection<Hotel> findAll();
    
}
