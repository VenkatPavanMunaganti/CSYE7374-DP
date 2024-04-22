package edu.neu.csye7374.Command;

import edu.neu.csye7374.*;

public class BuyCarCommand implements CommandAPI {
    private static BuyCarCommand instance;
    private Car car;

    private BuyCarCommand() {
        super();
    }

    public static synchronized BuyCarCommand getInstance() {
        if (instance == null) {
            instance = new BuyCarCommand();
        }
        return instance;
    }

    @Override
    public String execute() {
        return car.buyCar();
    }

    public Car getCar() {
        return car;
    }

    public BuyCarCommand setCar(Car car) {
        this.car = car;
        return this;
    }
}