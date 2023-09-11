package structural.decorator;

public class NormalCoffeeMachine implements CoffeeMachine {
    @Override
    public String smallCoffee() {
        return "Small Coffee";
    }

    @Override
    public String mediumCoffee() {
        return "Medium Coffee";
    }

    @Override
    public String bigCoffee() {
        return "Big Coffee";
    }

}
