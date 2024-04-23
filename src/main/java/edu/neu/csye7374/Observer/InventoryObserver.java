package edu.neu.csye7374.Observer;

import edu.neu.csye7374.Facade.CarDeliveryType;

public class InventoryObserver implements CheckoutObserverAPI {

	@Override
	public void update(CarOrder carorder) {
		// TODO Auto-generated method stub
		if (carorder.getCarDeliveryType() == CarDeliveryType.Delivery) {
			if (carorder.getTotal() <= 10000) {
				carorder.setDeliveryCost(50);
			} else {
				carorder.setDeliveryCost(200);
			}   
		}
	}
}
