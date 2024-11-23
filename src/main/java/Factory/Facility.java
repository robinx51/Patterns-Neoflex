package Factory;

public class Facility {
    private final CoffeeMachine coffeeMachine;

    public Facility(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        ICoffee iCoffee = coffeeFactory.getCoffee(coffeeType);
        coffeeMachine.MakeCoffee(iCoffee);
    }
}
