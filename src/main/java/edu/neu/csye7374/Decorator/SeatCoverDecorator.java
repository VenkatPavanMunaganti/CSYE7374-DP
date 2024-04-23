package edu.neu.csye7374.Decorator;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.CarAPI;

public class SeatCoverDecorator extends CarDecorator {

    public SeatCoverDecorator(CarAPI decoratedCar) {
        super(decoratedCar);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String carDescription() {
        // TODO Auto-generated method stub
        return decoratedCar.carDescription() + ", Added seat covers to the car order";
    }

    @Override
    public Object getCarManufacturer() {
        // TODO Auto-generated method stub
        return decoratedCar.getCarManufacturer();
    }

    public double getCarPrice() {
        Car b = Car.class.cast(decoratedCar);
        return b.getCarPrice() + 200;
    }

}
