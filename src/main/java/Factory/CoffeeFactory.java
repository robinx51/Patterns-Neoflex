package Factory;

public class CoffeeFactory {
    public ICoffee getCoffee(CoffeeType coffeeType) {
        ICoffee coffee = null;
        switch (coffeeType) {
            case CAPPUCCINO:
                coffee = new Cappucino();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            default:
                throw new IllegalArgumentException("Invalid coffee type");
        }
        return coffee;
    }
}
