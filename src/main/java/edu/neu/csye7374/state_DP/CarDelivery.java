package edu.neu.csye7374.state_DP;

import edu.neu.csye7374.Observer.CarOrder;

public class CarDelivery implements CarDeliveryStateAPI {

    private CarOrder order;

    public CarDelivery(CarOrder order) {
        super();
        this.order = order;
    }

    @Override
    public void carConfirmed_state() {
        System.out.println("Sorry, CarOrder already CONFIRMED");
    }

    @Override
    public void carDeliveryStatus_state() {
        System.out.println("Sorry,  CarOrder already in DISPATCH state");
    }

    @Override
    public void carDelivered_state() {
        order.setState(order.getCarOrderDelivered());
        System.out.println("Thank you for choosing us, CarOrder successfully DELIVERED");
    }
}
