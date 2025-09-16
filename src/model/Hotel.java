package model;

public class Hotel {

    private String UuidHotel;
    private String nameHotel;
    private String AdresseHotel;
    private int availableRooms;
    private Double note;

    public Hotel(String uuidHotel, String nameHotel, String adresseHotel, int availableRooms, Double note) {
        UuidHotel = uuidHotel;
        this.nameHotel = nameHotel;
        AdresseHotel = adresseHotel;
        this.availableRooms = availableRooms;
        this.note = note;
    }

    public String getUuidHotel() {
        return UuidHotel;
    }

    public void setUuidHotel(String uuidHotel) {
        UuidHotel = uuidHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getAdresseHotel() {
        return AdresseHotel;
    }

    public void setAdresseHotel(String adresseHotel) {
        AdresseHotel = adresseHotel;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "UuidHotel='" + UuidHotel + '\'' +
                ", nameHotel='" + nameHotel + '\'' +
                ", AdresseHotel='" + AdresseHotel + '\'' +
                ", availableRooms=" + availableRooms +
                ", note=" + note +
                '}';
    }
}
