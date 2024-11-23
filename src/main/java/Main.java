import Adapter.Computer;
import Adapter.SDAdapter;
import Adapter.SDCard;
import Adapter.USBCard;
import Factory.CoffeeMachine;
import Factory.CoffeeType;
import Factory.Facility;
import Proxy.DbReader;
import Proxy.DbReaderProxy;
import Singleton.Logger;

public class Main {
    public static void main(String[] args) {
        // Singleton
        System.out.println("-----------------------------");
        Logger logger = Logger.getInstance();
        Logger.classLogg(logger, "singleton");
        System.out.println("-----------------------------");

        // Factory
        Facility facility = new Facility(new CoffeeMachine());
        facility.start(CoffeeType.CAPPUCCINO);
        System.out.println("-----------------------------");

        // Adapter
        SDAdapter sdAdapter = new SDAdapter(new SDCard());
        Computer computer = new Computer();
        computer.insert(sdAdapter);
        System.out.println("-----------------------------");

        // Proxy
        DbReader dbReader = new DbReader();
        DbReaderProxy proxy = new DbReaderProxy(dbReader);
        proxy.getConnection("messenger");
        proxy.getConnection("messenger");
        System.out.println("-----------------------------");
    }
}
