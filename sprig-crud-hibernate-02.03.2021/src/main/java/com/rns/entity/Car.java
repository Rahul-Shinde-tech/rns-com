package com.rns.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="carid")
	private int carId;
	
	@Column(name="carname")
	private String carName;
	
	@Column(name="carcolor")
	private String carColor;
	
	@Column(name="carprice")
	private int carPrice;
	
	@Column(name="carquantity")
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

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int carId, String carName, String carColor, int carPrice, int carQuantity) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.carQuantity = carQuantity;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ ", carQuantity=" + carQuantity + "]";
	}
	
	
}
