package structural.decorator;

public class Test {
    public static void main(String args[]) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        UltraCoffeeMachine newBrand = new UltraCoffeeMachine(normal);
        System.out.println(newBrand.smallCoffee());
        System.out.println(newBrand.mediumCoffee());
        System.out.println(newBrand.bigCoffee());
        System.out.println(newBrand.coffeeWithCream());
    }
}
