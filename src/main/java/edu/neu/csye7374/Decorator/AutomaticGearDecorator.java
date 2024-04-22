package edu.neu.csye7374.Decorator;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.CarAPI;

public class AutomaticGearDecorator extends CarDecorator {

    public AutomaticGearDecorator(CarAPI decoratedBike) {
        super(decoratedBike);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String carDescription() {
        // TODO Auto-generated method stub
        return decoratedCar.carDescription() + ", Added Gears to the bike";
    }

    @Override
    public Object getCarManufacturer() {
        // TODO Auto-generated method stub
        return decoratedCar.getCarManufacturer();
    }

    public double getCarPrice() {
        Car b = Car.class.cast(decoratedCar);
        return b.getCarPrice() + 100;
    }

}
