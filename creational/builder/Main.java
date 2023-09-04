package creational.builder;

public class Main {
    public static void main(String args[]) {
        ApartmentBuilder apartmentBuilder = ApartmentBuilder.getInstance();
        Apartment apartment1 = apartmentBuilder
                .setSquareMeters(1000)
                .setRoomNo(2)
                .setAddress("Sherbrooke Street")
                .setCity("Montreal")
                .setHasBalcony(false)
                .getApartment();

        System.out.println(apartment1.toString());

        Apartment apartment2 = apartmentBuilder
                .setSquareMeters(900)
                .setRoomNo(1)
                .setCity("Toronto")
                .setAddress("Richmond hills")
                .setHasBalcony(true)
                .getApartment();

        System.out.println(apartment2);


    }
}
