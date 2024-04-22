package edu.neu.csye7374.Observer;

import edu.neu.csye7374.Facade.CarDeliveryType;

public class InventoryObserver implements CheckoutObserverAPI {

	@Override
	public void update(CarOrder carorder) {
		// TODO Auto-generated method stub
		if (carorder.getCarDeliveryType() == CarDeliveryType.Delivery) {
			int count = carorder.getCarCount();
			if (count <= 5) {
				carorder.setDeliveryCost(20);
			} else {
				carorder.setDeliveryCost((count - 5) + 10 * 3);
			}
		}
	}
}
