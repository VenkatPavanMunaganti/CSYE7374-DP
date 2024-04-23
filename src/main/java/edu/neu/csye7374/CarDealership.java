package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neu.csye7374.Builder.CarBuilder;
import edu.neu.csye7374.Builder.EmployeeBuilder;
import edu.neu.csye7374.Command.Invoker;
import edu.neu.csye7374.Decorator.CarDecorator;
import edu.neu.csye7374.Decorator.SeatCoverDecorator;
import edu.neu.csye7374.Decorator.Insurance;
import edu.neu.csye7374.Facade.CarDeliveryType;
import edu.neu.csye7374.Facade.CarOrderFacade;
import edu.neu.csye7374.Factory.CarFactory;
import edu.neu.csye7374.Factory.EmployeeFactory;
import edu.neu.csye7374.Observer.CarOrder;
import edu.neu.csye7374.state_DP.*;
import edu.neu.csye7374.Strategy.*;
import edu.neu.csye7374.fileUtil.FileUtil;

public class CarDealership{

    private String name;
    private List<Car> itemList = new ArrayList<>();
    private List<Person> personList = new ArrayList<>();
    public static OfferStrategy usingStrategy = OfferStrategy.NONE;
    private static final String FILE_NAME = "src/main/java/edu/neu/csye7374/datastore/CarsData.txt";

    private static Map<OfferStrategy, OfferStrategyAPI> strategyMap = new HashMap<>();
    {
        strategyMap.put(OfferStrategy.StudentOfferStrategy, new StudentOfferStrategy());
        strategyMap.put(OfferStrategy.ExchangeOfferStrategy, new ExchangeOfferStrategy());
        strategyMap.put(OfferStrategy.FamilyOfferStrategy, new FamilyOfferStrategy());
        strategyMap.put(OfferStrategy.NewMemberOfferStrategy, new NewMemberOfferStrategy());
    }

    public CarDealership(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getItemList() {
        return itemList;
    }

    public void setItemList(List<Car> itemList) {
        this.itemList = itemList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public static OfferStrategy getUsingStrategy() {
        return usingStrategy;
    }

    public static void setUsingStrategy(OfferStrategy usingStrategy) {
        CarDealership.usingStrategy = usingStrategy;
    }

    public static Map<OfferStrategy, OfferStrategyAPI> getstrategyMap() {
        return strategyMap;
    }

    public static void setAlgorithmMap(Map<OfferStrategy, OfferStrategyAPI> strategyMap) {
        CarDealership.strategyMap = strategyMap;
    }

    public static void demo() {

        FileUtil.getFileData(FILE_NAME);

        List<Car> carList = new ArrayList<>();
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("------------ Builder ------- Eager Singleton ------- Factory Patterns used -------");
        CarBuilder carBuilder = new CarBuilder(1, "Porsche-811", 115000, CarCategory.Sports, "Porsche");
        CarAPI car = CarFactory.getInstance().getObject(carBuilder);
        carList.add((Car) car);
        System.out.println("");
        System.out.println(car);
        FileUtil.appendEntryToFile(FILE_NAME, carBuilder);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));

        System.out.println("\n");
        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Prototype ------------");
        System.out.println("");
        Manufacturer manufact = Manufacturer.getInstance();
        Manufacturer man = manufact.clone();
        man.setManufacturerName("Porsche")
                .setManufacturingYear(2020)
                .setNoOfCarsReleased(20);
        System.out.println(man);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Adapter Pattern using Car ------------");
        System.out.println("");
        ManufacturerObjectAdapter manufacturerAdapter = new ManufacturerObjectAdapter(car, man);

        System.out.println(manufacturerAdapter);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Facade ----------- Decorator ---------- Observer ------------");
        System.out.println("");
        CarOrderFacade orderFacade = new CarOrderFacade(car);
        CarOrder order = orderFacade.carOrder();
        System.out.println("");
        System.out.println(order);
        System.out.println("");
        order.setCarDeliveryType(CarDeliveryType.Delivery);

        carBuilder = new CarBuilder(2, "C-Class", 45000.0, CarCategory.Sedan, "Porche");
        car = CarFactory.getInstance().getObject(carBuilder);
        CarDecorator carWithSeatDecorator = new SeatCoverDecorator(car);
        System.out.println(carWithSeatDecorator);
        order.addCar(carWithSeatDecorator);
        System.out.println("");
        System.out.println(order);
        System.out.println("");
        carList.add((Car) car);
        FileUtil.appendEntryToFile(FILE_NAME, carBuilder);

        carBuilder = new CarBuilder(3, "D-Class", 49000.0, CarCategory.Sports, "Porche");
        car = CarFactory.getInstance().getObject(carBuilder);
        CarDecorator carWithInsurance = new Insurance(car);
        System.out.println(carWithInsurance);
        order.addCar(carWithInsurance);
        System.out.println("");
        System.out.println(order);
        System.out.println("");
        carList.add((Car) car);
        FileUtil.appendEntryToFile(FILE_NAME, carBuilder);

        carBuilder = new CarBuilder(4, "M-Class", 60000.0, CarCategory.MiniVan, "Porche");
        car = CarFactory.getInstance().getObject(carBuilder);
        order.addCar(car);
        System.out.println(order);
        carList.add((Car) car);
        FileUtil.appendEntryToFile(FILE_NAME, carBuilder);

        carBuilder = new CarBuilder(5, "Z-Class", 145000.0, CarCategory.Limo, "Porche");
        car = CarFactory.getInstance().getObject(carBuilder);
        order.addCar(car);
        System.out.println(order);
        carList.add((Car) car);

        carBuilder = new CarBuilder(6, "S-Class", 45000.0, CarCategory.SUV, "Porche");
        car = CarFactory.getInstance().getObject(carBuilder);
        order.addCar(car);
        System.out.println(order);
        carList.add((Car) car);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Command Pattern ------------");
        System.out.println("");
        Invoker invoker = new Invoker();
        System.out.println("######## Sold Cars #########");
        invoker.placeCarOrders(carList);
        System.out.println("");
        System.out.println("######## Rented Cars #########");
        invoker.rentCarOrders(carList);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Factory ------------ Singleton ---------- EmployeeBuilder ----------");
        System.out.println("");
        CarDealership carDealership = new CarDealership("Super Cars Store");
        EmployeeBuilder emplBuilder = new EmployeeBuilder(7, 27, "John", "Doe", 18.5);
        Employee empl = EmployeeFactory.getInstance().getObject(emplBuilder);
        System.out.println(empl);
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- State ------------");
        System.out.println("");
        
        order.confirmOrder();
        System.out.println("Trying to confirm the order after the order is confirmed");
        order.carConfirmed_state();
        System.out.println("Trying to deliver the order after the order is confirmed");
        order.carDelivered_state();
        System.out.println("Trying to dispatch the order after the order is confirmed");
        order.carDeliveryStatus_state();
        System.out.println("Trying to deliver the order after the order is dispatched");
        order.carDelivered_state();
        System.out.println("Trying to deliver the order after the order is delivered");
        order.carDelivered_state();
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");

        System.out.println("" + ".".repeat(30) + "Pattern Demo Start" + ".".repeat(30));
        System.out.println("");
        System.out.println("----------- Strategy ------------");
        System.out.println("");
        System.out.println("Bike before discount: \n" + car);
        double price = 0;
        for (OfferStrategy strategy : CarDealership.getstrategyMap().keySet()) {
            order.setUsingStrategy(strategy);
            price = order.runStrategy();
            System.out.println("Bike price after discount during sale: " + strategy + " Price :" + price);
        }
        System.out.println("");
        System.out.println("" + ".".repeat(30) + "Pattern Demo End" + ".".repeat(30));
        System.out.println("\n");
    }

}
