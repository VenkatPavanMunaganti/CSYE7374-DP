package edu.neu.csye7374.Command;

import java.util.*;

import edu.neu.csye7374.Car;

public class Invoker {
    private List<Car> orderList = new ArrayList<>();

    public void takeBikeOrder(Car order) {
        orderList.add(order);
    }

    public void placeBikeOrders() {
        BuyCarCommand buyCarCommand = BuyCarCommand.getInstance();
        for (Car order : orderList) {
            System.out.println(buyCarCommand.setCar(order).execute());
        }
        orderList.clear();
    }

    public void placeBikeOrders(List<Car> carList) {
        for (Car b : carList) {
            orderList.add(b);
        }
        placeBikeOrders();
    }

    public void rentBikeOrders() {
        RentCarCommand rentCarCommand = RentCarCommand.getInstance();
        for (Car order : orderList) {
            System.out.println(rentCarCommand.setCar(order)
                    .execute());
        }
        orderList.clear();
    }

    public void rentBikeOrders(List<Car> carList) {
        for (Car b : carList) {
            orderList.add(b);
        }
        rentBikeOrders();
    }

    public List<Car> getBikeOrderList() {
        return orderList;
    }

    public void setBikeOrderList(List<Car> orderList) {
        this.orderList = orderList;
    }

}
