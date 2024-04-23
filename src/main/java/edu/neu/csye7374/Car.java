package edu.neu.csye7374;

import edu.neu.csye7374.Builder.CarBuilder;
import edu.neu.csye7374.Strategy.OfferStrategy;

public class Car implements CarAPI {

    public int carId;
    public String carName;
    public double carPrice;
    public CarCategory carCategory;
    public Object carManufacturer;

    public Car(CarBuilder builder) {
        super();
        this.carId = builder.getCarId();
        this.carName = builder.getCarName();
        this.carPrice = builder.getCarPrice();
        this.carCategory = builder.getCarCategory();
        this.carManufacturer = builder.getCarManufacturer();
    }

    public Object getCarManufacturer() {
        return String.class.cast(carManufacturer);
    }

    @Override
    public void setCarManufacturer(String CarManufacturer) {
        this.carManufacturer = CarManufacturer;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double CarkPrice) {
        this.carPrice = carPrice;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    @Override
    public String carDescription() {
        // TODO Auto-generated method stub
        return this.carName + ", category : " + this.carCategory;
    }

    @Override
    public int noOfCarsRented() {
        // TODO Auto-generated method stub
        return (int) Math.random() * 5;
    }
    
    public double getCarRentPrice(){
        double rentPrice = this.carPrice * 0.05;
        rentPrice = Math.round(rentPrice * 100.0) / 100.0;
        return rentPrice;
    }

    @Override
    public String toString() {
        return carId + "," + carName + "," + carCategory + "," + carManufacturer + "," + carPrice;
    }

    

    public String buyCar() {
        return this.toString() + " is bought!!!!";
    }

    public String rentCar() {
        double rentPrice = this.carPrice * 0.05;
        rentPrice = Math.round(rentPrice * 100.0) / 100.0;
        this.carPrice = rentPrice;
        return this.toString() + " is rented!!";
    }
}
