package edu.neu.csye7374.Observer;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.CarAPI;
import edu.neu.csye7374.Facade.CarDeliveryType;
import edu.neu.csye7374.state_DP.CarOrderConfirmed;
import edu.neu.csye7374.state_DP.CarDelivered;
import edu.neu.csye7374.state_DP.CarDelivery;
import edu.neu.csye7374.state_DP.CarDeliveryStateAPI;

public class CarOrder implements CarDeliveryStateAPI {

	private int carId;
	private double carOrderCost = 0;
	private int carCount = 0;
	private double offerDiscount = 0;
	private double shippingCost;
	private CarDeliveryType deliveryType;
	private static int counter = 0;
	private List<CheckoutObserverAPI> observers = new ArrayList<>();
	private List<CarAPI> carList = new ArrayList<>();

	{
		observers.add(new CarPriceObserver());
		observers.add(new InventoryObserver());
	}

	private CarDeliveryStateAPI orderConfirmed = new CarOrderConfirmed(this);
	private CarDeliveryStateAPI orderDispatched = new CarDelivery(this);
	private CarDeliveryStateAPI orderDelivered = new CarDelivered(this);
	private CarDeliveryStateAPI state;

	public CarOrder() {
		super();
		this.carId = ++counter;
		this.deliveryType = CarDeliveryType.Pickup;
		this.state = getCarOrderConfirmed();
	}

	public CarOrder(double orderCost, int carCount, double shippingCost, CarDeliveryType deliveryType) {
		super();
		this.carId = ++counter;
		this.carOrderCost = orderCost;
		this.carCount = carCount;
		this.deliveryType = deliveryType;

		if (deliveryType == CarDeliveryType.Pickup) {
			this.shippingCost = 0;
		} else {
			this.shippingCost = shippingCost;
		}
		this.state = getCarOrderConfirmed();
	}

	public void addCar(CarAPI Car) {
		carList.add(Car);
		carOrderCost += Car.getCarPrice();
		carCount++;
		observers.forEach(o -> o.update(this));
	}

	public boolean removeCar(CarAPI Car) {
		if (carList.remove(Car)) {
			return true;
		}
		return false;
	}

	public CarDeliveryStateAPI getCarOrderConfirmed() {
		return orderConfirmed;
	}

	public void setCarOrderConfirmed(CarDeliveryStateAPI orderConfirmed) {
		orderConfirmed = orderConfirmed;
	}

	public CarDeliveryStateAPI getCarOrderDelivered() {
		return orderDelivered;
	}

	public void setCarOrderDelivered(CarDeliveryStateAPI orderDelivered) {
		orderDelivered = orderDelivered;
	}

	public CarDeliveryStateAPI getCarOrderDispatched() {
		return orderDispatched;
	}

	public void setCarOrderDispatched(CarDeliveryStateAPI orderDispatched) {
		orderDispatched = orderDispatched;
	}

	public CarDeliveryStateAPI getState() {
		return state;
	}

	public void setState(CarDeliveryStateAPI state) {
		this.state = state;
	}

	public List<CarAPI> getCarList() {
		return carList;
	}

	public void setCarList(List<CarAPI> CarList) {
		this.carList = CarList;
	}

	public String getCarListString() {
		StringBuilder sb = new StringBuilder();
		for (CarAPI b : carList) {
			sb.append(b);
			sb.append("; ");
		}
		return sb.toString();
	}

	public CarDeliveryType getCarDeliveryType() {
		return deliveryType;
	}

	public void setCarDeliveryType(CarDeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CarOrder.counter = counter;
	}

	public List<CheckoutObserverAPI> getObservers() {
		return observers;
	}

	public void setObservers(List<CheckoutObserverAPI> observers) {
		this.observers = observers;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public double getCarOrderCost() {
		return carOrderCost;
	}

	public void attach(CheckoutObserverAPI observer) {
		observers.add(observer);
	}

	public void detach(CheckoutObserverAPI observer) {
		observers.remove(observer);
	}

	public CarOrder(int id) {
		this.carId = id;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int id) {
		this.carId = id;
	}

	public double getTotal() {
		return carOrderCost - offerDiscount + shippingCost;
	}

	public void setCarOrderCost(double orderCost) {
		this.carOrderCost = orderCost;
	}

	public int getCarCount() {
		return carList.size();
	}

	public double getOfferDiscount() {
		return offerDiscount;
	}

	public void setOfferDiscount(double offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public double getDeliveryCost() {
		return shippingCost;
	}

	public void setDeliveryCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	@Override
	public String toString() {
		return "CarOrder [id=" + carId + ", OrderCost=" + carOrderCost + ", count=" + carCount + ", discount="
				+ offerDiscount
				+ ", shippingCost=" + shippingCost + "]";
	}

	@Override
	public void carConfirmed_state() {
		this.state.carConfirmed_state();
	}

	@Override
	public void carDeliveryStatus_state() {
		this.state.carDeliveryStatus_state();
	}

	@Override
	public void carDelivered_state() {
		this.state.carDelivered_state();
	}
}
