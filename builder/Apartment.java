package builder;

public class Apartment {
    private int squareMeters;
    private int roomNo;
    private String city;
    private String address;
    private boolean hasBalcony;

    public Apartment(int squareMeters, int roomNo, String city, String address, boolean hasBalcony){
        this.squareMeters = squareMeters;
        this.roomNo = roomNo;
        this.city = city;
        this.address = address;
        this.hasBalcony = hasBalcony;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    @Override
    public String toString() {
        String description = "Apartment{";
        if (squareMeters > 0)
            description += "squateMeters=" + squareMeters;
        if (roomNo > 0)
            description += ", roomNo=" + roomNo;
        if (city != "" || city != null)
            description += ", city='" + city + '\'';
        if (address != "" || address != null)
            description += ", address='" + address + '\'';
        if (hasBalcony) description += ", the apartment has a balcony";
        description += '}';

        return description;
    }
}
