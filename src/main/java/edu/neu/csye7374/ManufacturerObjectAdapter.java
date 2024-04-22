package edu.neu.csye7374;

public class ManufacturerObjectAdapter implements CarAPI {

    private Manufacturer manufacturer;
    private CarAPI car;

    public ManufacturerObjectAdapter(CarAPI car, Manufacturer adaptee) {
        this.car = car;
        this.manufacturer = adaptee;
        setCarManufacturer(adaptee.getManufacturerName());
    }

    @Override
    public String carDescription() {
        // TODO Auto-generated method stub
        return car.carDescription();
    }

    @Override
    public Object getCarManufacturer() {
        // TODO Auto-generated method stub
        return Manufacturer.class.cast(manufacturer);
    }

    @Override
    public String toString() {
        return "###### " + manufacturer + "#####, ##### Car :" + car + "#####";
    }

    @Override
    public double getCarPrice() {
        // TODO Auto-generated method stub
        return car.getCarPrice();
    }

    @Override
    public int noOfCarsRented() {
        // TODO Auto-generated method stub
        return car.noOfCarsRented();
    }

    @Override
    public void setCarManufacturer(String carManufacturer) {
        // TODO Auto-generated method stub
        this.car.setCarManufacturer(carManufacturer);
    }

}
