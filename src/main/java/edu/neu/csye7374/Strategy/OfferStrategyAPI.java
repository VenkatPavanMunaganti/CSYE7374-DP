package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.Car;

public interface OfferStrategyAPI {
	public double discountAmt(Car car);

	public String discountDesc(Car car);
}
