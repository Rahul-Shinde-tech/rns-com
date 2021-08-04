package com.rns.bean;


public class CarBean {
	
	private int carId;
	
	private String carName;
	
	private String carColor;
	
	private int carPrice;
	
	private int carQuantity;

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

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarQuantity() {
		return carQuantity;
	}

	public void setCarQuantity(int carQuantity) {
		this.carQuantity = carQuantity;
	}

	@Override
	public String toString() {
		return "CarBean [carId=" + carId + ", carName=" + carName + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ ", carQuantity=" + carQuantity + "]";
	}

	public CarBean(int carId, String carName, String carColor, int carPrice, int carQuantity) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.carQuantity = carQuantity;
	}

	public CarBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
