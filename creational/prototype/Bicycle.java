package creational.prototype;

public class Bicycle extends Vehicle {
    private String color;

    public Bicycle() {
    }

    public Bicycle(int price, int produtionYear, String color) {
        super(price, produtionYear);
        this.color = color;
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(getPrice(), getProductionYear(), color);
    }

    @Override
    public boolean isClone(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            Bicycle b = (Bicycle) vehicle;
            if (b.getPrice() == getPrice() && b.getProductionYear() == getProductionYear() & b.color.equals(color)) {
                return true;
            }
        }
        return false;
    }
}
