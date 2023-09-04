package creational.builder;

public class ApartmentBuilder {
    private static ApartmentBuilder apartmentBuilder;
    private int squareMeters;
    private int roomNo;
    private String city;
    private String address;
    private boolean hasBalcony;

    private ApartmentBuilder() {
        this.squareMeters = -1;
        this.roomNo = -1;
        this.city = "";
        this.address = "";
        this.hasBalcony = false;
    }

    public static ApartmentBuilder getInstance() {
        if (apartmentBuilder == null) {
            apartmentBuilder = new ApartmentBuilder();
        }
        return apartmentBuilder;
    }

    public ApartmentBuilder setAddress(String address) {
        apartmentBuilder.address = address;
        return apartmentBuilder;

    }

    public ApartmentBuilder setCity(String city) {
        apartmentBuilder.city = city;
        return apartmentBuilder;
    }

    public ApartmentBuilder setHasBalcony(boolean hasBalcony) {
        apartmentBuilder.hasBalcony = hasBalcony;
        return apartmentBuilder;
    }

    public ApartmentBuilder setRoomNo(int roomNo) {
        apartmentBuilder.roomNo = roomNo;
        return apartmentBuilder;
    }

    public ApartmentBuilder setSquareMeters(int squareMeters) {
        apartmentBuilder.squareMeters = squareMeters;
        return apartmentBuilder;
    }

    public Apartment getApartment() {
        Apartment apartment = new Apartment(squareMeters, roomNo, city, address, hasBalcony);
        return apartment;
    }
}
