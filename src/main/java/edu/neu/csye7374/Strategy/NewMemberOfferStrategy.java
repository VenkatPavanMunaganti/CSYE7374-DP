package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.Car;

public class NewMemberOfferStrategy implements OfferStrategyAPI {

	@Override
	public double discountAmt(Car car) {
		// TODO Auto-generated method stub
		double rate = 0.30;
		double offer = car.getCarPrice() - (car.getCarPrice() * rate);
		offer = (double) Math.round(offer * 100) / 100;
		return offer;

	}

	@Override
	public String discountDesc(Car car) {
		// TODO Auto-generated method stub
		return "30% discount for New member offer added!";
	}
}
