package edu.neu.csye7374.Decorator;

import edu.neu.csye7374.*;

public class DashcamDecorator extends CarDecorator {

    public DashcamDecorator(CarAPI decoratedCar) {
        super(decoratedCar);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String carDescription() {
        // TODO Auto-generated method stub
        return decoratedCar.carDescription() + ", Added Dashcam to the car order";
    }

    @Override
    public Object getCarManufacturer() {
        // TODO Auto-generated method stub
        return decoratedCar.getCarManufacturer();
    }

    public double getCarPrice() {
        Car b = Car.class.cast(decoratedCar);
        return b.getCarPrice() + 560;
    }

}
