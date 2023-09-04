package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Food burrito = new Burrito();
        Food pizza = new Pizza();
        ShapeFactory shapeFactory = new ShapeFactory(burrito);
        System.out.println(shapeFactory.getFoodShape());
        shapeFactory.setFood(pizza);
        System.out.println(shapeFactory.getFoodShape());
    }

}
