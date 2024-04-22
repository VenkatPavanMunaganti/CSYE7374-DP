package edu.neu.csye7374.Factory;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.Builder.CarBuilder;
import edu.neu.csye7374.Builder.BuilderAPI;

public class CarFactory implements CarFactoryAPI<Car> {

	private static CarFactory instance = new CarFactory(); // Eager Singleton Factory Class

	private CarFactory() {
		super();
	}

	public synchronized static CarFactory getInstance() {
		return instance;
	}

	@Override
	public Car getObject(BuilderAPI<Car> builder) {
		// TODO Auto-generated method stub
		CarBuilder carBuilder = (CarBuilder) builder;
		return new Car(carBuilder);
	}

}
