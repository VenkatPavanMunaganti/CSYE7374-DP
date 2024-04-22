package edu.neu.csye7374.Decorator;

import edu.neu.csye7374.*;;

public class CarDecorator implements CarAPI {
	protected CarAPI decoratedCar;

	public CarDecorator(CarAPI decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public String carDescription() {
		// TODO Auto-generated method stub
		return decoratedCar.carDescription();
	}

	@Override
	public int noOfCarsRented() {
		// TODO Auto-generated method stub
		return decoratedCar.noOfCarsRented();
	}

	public CarAPI getDecoratedCar() {
		return this.decoratedCar;
	}

	@Override
	public String toString() {
		return "BikeDecorator [bikeDescription :" + carDescription() + ", "
				+ " $ " + getDecoratedCar() + " $";
	}

	@Override
	public Object getCarManufacturer() {
		return this.decoratedCar.getCarManufacturer();
	}

	@Override
	public double getCarPrice() {
		// TODO Auto-generated method stub
		return this.decoratedCar.getCarPrice();
	}

	@Override
	public void setCarManufacturer(String bikeManufacturer) {

	}
}
