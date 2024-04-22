package edu.neu.csye7374.state_DP;

import edu.neu.csye7374.Observer.CarOrder;

public class CarDelivered implements CarDeliveryStateAPI {
    private CarOrder order;

    public CarDelivered(CarOrder order) {
        super();
        this.order = order;
    }

    @Override
    public void carConfirmed_state() {
        System.out.println("Sorry, CarOrder already DELIVERED");
    }

    @Override
    public void carDeliveryStatus_state() {
        System.out.println("Sorry,  CarOrder already DELIVERED");
    }

    @Override
    public void carDelivered_state() {
        System.out.println("Sorry, CarOrder already DELIVERED");
    }
}
