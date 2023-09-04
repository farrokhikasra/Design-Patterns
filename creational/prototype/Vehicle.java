package creational.prototype;

public abstract class Vehicle {
    private int price;
    private int productionYear;

    public Vehicle() {
    }

    public Vehicle(int price, int productionYear) {
        this.price = price;
        this.productionYear = productionYear;
    }

    public int getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle vehicle);
}
