package edu.neu.csye7374.Observer;

public class CarPriceObserver implements CheckoutObserverAPI {

	@Override
	public void update(CarOrder carorder) {
		// TODO Auto-generated method stub
		double orderTotal = carorder.getCarOrderCost();
		if (orderTotal >= 700) {
			carorder.setOfferDiscount(30);
		} else if (orderTotal >= 400) {
			carorder.setOfferDiscount(15);
		}
	}

}
