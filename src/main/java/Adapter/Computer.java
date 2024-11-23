package Adapter;

public class Computer {
    public void insert (USBCard card) {
        card.set();
        System.out.println("Накопитель подключен в разъем USB");
    }
}
