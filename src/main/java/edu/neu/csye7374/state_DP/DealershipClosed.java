package edu.neu.csye7374.state_DP;

import edu.neu.csye7374.CarDealership;

public class DealershipClosed implements CarDealershipAPI {

    private static CarDealership cardealership;

    public DealershipClosed(CarDealership dock) {
        super();
        DealershipClosed.cardealership = dock;
    }

    @Override
    public void storeOpened() {
        // TODO Auto-generated method stub
        cardealership.setState(cardealership.getCloseState());
        System.out.println("Transition from Close State to Open State");

    }

    @Override
    public void storeClosed() {
        // TODO Auto-generated method stub
        System.out.println("Error ... Already in Close State");
    }
}
