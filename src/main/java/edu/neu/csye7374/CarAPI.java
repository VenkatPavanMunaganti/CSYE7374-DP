package edu.neu.csye7374;

public interface CarAPI {
    String carDescription();

    Object getCarManufacturer();

    void setCarManufacturer(String bikeManufacturer);

    int noOfCarsRented();

    double getCarPrice();

}
