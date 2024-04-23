package edu.neu.csye7374.Facade;

import edu.neu.csye7374.CarAPI;
import edu.neu.csye7374.Decorator.CarDecorator;
import edu.neu.csye7374.Decorator.DashcamDecorator;
import edu.neu.csye7374.Decorator.Insurance;
import edu.neu.csye7374.Decorator.SeatCoverDecorator;
import edu.neu.csye7374.Observer.CarOrder;

public class CarOrderFacade {
	private CarAPI car;

	public CarOrderFacade() {
		super();
	}

	public CarOrderFacade(CarAPI car) {
		super();
		this.setCar(car);
	}

	public CarOrderFacade setCar(CarAPI car) {
		this.car = car;
		return this;
	}

	public CarAPI getCar() {
		return car;
	}

	public CarOrder carOrder() {
            CarOrder order = new CarOrder();
            CarDecorator insurance = new Insurance(car);
            System.out.println(insurance);
            order.addCar(insurance);
            return order;
	}

}
