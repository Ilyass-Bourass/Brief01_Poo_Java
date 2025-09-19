package Repositories;

import java.util.Collection;

import model.Resevation;

public interface ReservationRepository {
    void addResevation(String id , Resevation reservation);
    boolean removeReservation(String id);
    Resevation findById(String id);
    Collection <Resevation> findAll();
}
