package edu.neu.csye7374.Command;

import edu.neu.csye7374.Car;

public class RentCarCommand implements CommandAPI {
    private static RentCarCommand instance;
    private Car car;

    private RentCarCommand() {
        super();
    }

    public static synchronized RentCarCommand getInstance() {
        if (instance == null) {
            instance = new RentCarCommand();
        }
        return instance;
    }

    @Override
    public String execute() {
        return car.rentCar();
    }

    public Car getCar() {
        return car;
    }

    public RentCarCommand setCar(Car car) {
        this.car = car;
        return this;
    }

}
