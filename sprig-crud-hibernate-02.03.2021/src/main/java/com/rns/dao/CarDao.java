package com.rns.dao;

import java.util.List;

import com.rns.entity.Car;

public interface CarDao {
	
	public int saveCar(Car car);
	
	public List<Car> listOfCars();
	
	public void deleteCar(int carId);
}
