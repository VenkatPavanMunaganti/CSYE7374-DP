package edu.neu.csye7374.Facade;

public enum CarDeliveryType {
    Delivery,
    Pickup;

    public static CarDeliveryType getBikeDeliveryType(String s) {
        switch (s.toLowerCase()) {
            case "delivery":
                return CarDeliveryType.Delivery;
            case "pickup":
                return CarDeliveryType.Pickup;
            default:
                return CarDeliveryType.Pickup;
        }
    }
}
