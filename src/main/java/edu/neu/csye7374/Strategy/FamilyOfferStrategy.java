package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.Observer.CarOrder;

public class FamilyOfferStrategy implements OfferStrategyAPI {
	@Override
	public double discountAmt(CarOrder carOrder) {
		// TODO Auto-generated method stub
		double rate = 0.20;
		double offer = (carOrder.getCarOrderCost() * rate);
		offer = (double) Math.round(offer * 100) / 100;
                carOrder.setOfferDiscount(offer);
		return offer;
	}

	@Override
	public String discountDesc(CarOrder carOrder) {
		// TODO Auto-generated method stub
		return "20% discount for family car offer added!";
	}
}
