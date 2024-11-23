package Factory;

public class CoffeeMachine {
    public void MakeCoffee(ICoffee coffee) {
        setVolume(coffee.getVolume());
    }

    private void setVolume(int volume) {
        System.out.println("Объём выбранного напитка: " + volume);
    }
}
