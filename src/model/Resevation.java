package model;

import java.time.Instant;

public class Resevation {
    private String UuidResevation;
    private Instant instant;
    private String hotelUuid;
    private String clientUuid;
    private int nombreNuits;

    public Resevation(String uuidResevation, Instant instant, String hotelUuid, String clientUuid, int nombreNuits) {
        UuidResevation = uuidResevation;
        this.instant = instant;
        this.hotelUuid = hotelUuid;
        this.clientUuid = clientUuid;
        this.nombreNuits = nombreNuits;
    }

    public String getUuidResevation() {
        return UuidResevation;
    }

    public void setUuidResevation(String uuidResevation) {
        UuidResevation = uuidResevation;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public String getHotelUuid() {
        return hotelUuid;
    }

    public void setHotelUuid(String hotelUuid) {
        this.hotelUuid = hotelUuid;
    }

    public String getClientUuid() {
        return clientUuid;
    }

    public void setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
    }

    public int getNombreNuits() {
        return nombreNuits;
    }

    public void setNombreNuits(int nombreNuits) {
        this.nombreNuits = nombreNuits;
    }

    @Override
    public String toString() {
        return "Resevation{" +
                "UuidResevation='" + UuidResevation + '\'' +
                ", instant=" + instant +
                ", hotelUuid='" + hotelUuid + '\'' +
                ", clientUuid='" + clientUuid + '\'' +
                ", nombreNuits=" + nombreNuits +
                '}';
    }
}
