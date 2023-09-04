package creational.prototype;

public class Car extends Vehicle {
    private String model;

    public Car(int price, int productionYear, String model) {
        super(price, productionYear);
        this.model = model;
    }


    @Override
    public Vehicle clone() {
        return new Car(getPrice(), getProductionYear(), model);
    }

    @Override
    public boolean isClone(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car c = (Car) vehicle;
            if (c.getPrice() == getPrice() && c.model.equals(model) && c.getProductionYear() == getProductionYear()) {
                return true;
            }
        }
        return false;
    }
}
