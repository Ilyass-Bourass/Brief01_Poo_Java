package model;

public class Resevation {
    private String UuidResevation;
    private String hotelUuid;
    private String clientUuid;
    private int nombreNuits;

    public Resevation(String uuidResevation, String hotelUuid, String clientUuid, int nombreNuits) {
        UuidResevation = uuidResevation;
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
                ", hotelUuid='" + hotelUuid + '\'' +
                ", clientUuid='" + clientUuid + '\'' +
                ", nombreNuits=" + nombreNuits +
                '}';
    }
}
