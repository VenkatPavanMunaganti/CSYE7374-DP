package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.Observer.CarOrder;

public interface OfferStrategyAPI {
	public double discountAmt(CarOrder carOrder);

	public String discountDesc(CarOrder carOrder);
}
