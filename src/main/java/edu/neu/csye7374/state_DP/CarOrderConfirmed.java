package edu.neu.csye7374.state_DP;

import edu.neu.csye7374.Observer.CarOrder;

public class CarOrderConfirmed implements CarDeliveryStateAPI {

    private CarOrder carorder;

    public CarOrderConfirmed(CarOrder carorder) {
        super();
        this.carorder = carorder;
    }

    @Override
    public void carConfirmed_state() {
        System.out.println("Sorry,  CarOrder already in CONFIRMED State");
    }

    @Override
    public void carDeliveryStatus_state() {
        carorder.setState(carorder.getCarOrderDispatched());
        System.out.println("Thank you for the confirmation, CarOrder DISPATCHED");
    }

    @Override
    public void carDelivered_state() {
        System.out.println("Sorry,  CarOrder not yet DISPATCHED");
    }

}
