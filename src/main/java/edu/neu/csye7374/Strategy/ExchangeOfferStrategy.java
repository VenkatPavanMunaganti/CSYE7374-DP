package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.Observer.CarOrder;

public class ExchangeOfferStrategy implements OfferStrategyAPI {

	@Override
	public double discountAmt(CarOrder carOrder) {
		// TODO Auto-generated method stub
		double rate = 0.40;
		double offer = (carOrder.getCarOrderCost() * rate);
		offer = (double) Math.round(offer * 100) / 100;
                carOrder.setOfferDiscount(offer);
		return offer;

	}

	@Override
	public String discountDesc(CarOrder car) {
		// TODO Auto-generated method stub
		return "40% discount for exchange bike offer added!";
	}
}
