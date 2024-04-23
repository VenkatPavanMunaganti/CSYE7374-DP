package edu.neu.csye7374;

public interface CarAPI {
    String carDescription();

    Object getCarManufacturer();

    void setCarManufacturer(String carManufacturer);

    int noOfCarsRented();

    double getCarPrice();

    public int getCarId();
    
    public double getCarRentPrice();
    
    public String getCarName();
    
    public CarCategory getCarCategory();
}
