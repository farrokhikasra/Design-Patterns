package structural.decorator;

public class UltraCoffeeMachine implements CoffeeMachine {
    private CoffeeMachine machine;

    public UltraCoffeeMachine(CoffeeMachine machine) {
        this.machine = machine;
    }


    @Override
    public String smallCoffee() {
        return machine.smallCoffee();
    }

    @Override
    public String mediumCoffee() {
        return machine.mediumCoffee();
    }

    @Override
    public String bigCoffee() {
        return machine.bigCoffee() + " and a donut";
    }

    public String coffeeWithCream() {
        return "Creamy cafe!!!";
    }
}
