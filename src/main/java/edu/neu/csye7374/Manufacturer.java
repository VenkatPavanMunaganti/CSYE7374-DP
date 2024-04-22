package edu.neu.csye7374;

//import edu.neu.csye7374.Factory_Pattern.EmployeeFactory;

public class Manufacturer implements Cloneable {
    private String manufacturerName;
    private int manufacturingYear;
    private int noOfBikesSold;
    private static Manufacturer instance;

    public Manufacturer() {
        super();
    }

    public static synchronized Manufacturer getInstance() {
        if (instance == null) {
            instance = new Manufacturer();
        }
        return instance;
    }

    private Manufacturer(String manufacturerName, int manufacturingYear, int noOfBikesSold) {
        super();
        this.manufacturerName = manufacturerName;
        this.manufacturingYear = manufacturingYear;
        this.noOfBikesSold = noOfBikesSold;
    }

    public void setValues(String line) {
        String[] values = line.split(",");
        this.setManufacturerName(values[0]);
        this.setNoOfCarsReleased(Integer.parseInt(values[1]));
        this.setManufacturingYear(Integer.parseInt(values[2]));
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public Manufacturer setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public Manufacturer setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
        return this;
    }

    public int getNoOfBikesSold() {
        return noOfBikesSold;
    }

    public Manufacturer setNoOfCarsReleased(int noOfBikesReleased) {
        this.noOfBikesSold = noOfBikesReleased;
        return this;
    }

    @Override
    public String toString() {
        return manufacturerName + "," + manufacturingYear + "," + noOfBikesSold;
    }

    @Override
    public Manufacturer clone() {
        Manufacturer clone = null;

        try {
            clone = (Manufacturer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
