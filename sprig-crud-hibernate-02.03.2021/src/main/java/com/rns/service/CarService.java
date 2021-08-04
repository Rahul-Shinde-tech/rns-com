package com.rns.service;

import java.util.List;

import com.rns.entity.Car;

public interface CarService {
	
	public int saveCar(Car car);
	
	public List<Car> listOfCars();
	
	public void deleteCar(int carId);
	
}
