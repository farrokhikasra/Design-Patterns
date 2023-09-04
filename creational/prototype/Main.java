package creational.prototype;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Car(2000, 2005, "Toyota");
        Vehicle vehicle2 = new Bicycle(500, 2020, "Blue");

        Vehicle clonedCar =  vehicle1.clone();
        Vehicle clonedBicycle =  vehicle2.clone();

        System.out.println(clonedCar.isClone(vehicle1));
        System.out.println(vehicle1.isClone(clonedCar));


        System.out.println(vehicle2.isClone(clonedBicycle));
        System.out.println(clonedBicycle.isClone(vehicle2));

        System.out.println(vehicle1.isClone(vehicle2));
    }
}
