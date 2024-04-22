package edu.neu.csye7374.state_DP;

import edu.neu.csye7374.CarDealership;

public class DealershipOpened implements CarDealershipAPI {
    private static CarDealership carDealership;

    public DealershipOpened(CarDealership dock) {
        super();
        DealershipOpened.carDealership = dock;
    }

    @Override
    public void storeOpened() {
        // TODO Auto-generated method stub
        System.out.println("Error ... Already in Open State");

    }

    @Override
    public void storeClosed() {
        // TODO Auto-generated method stub
        carDealership.setState(carDealership.getCloseState());
        System.out.println("Currently in Close State");
    }

}
