package com.rns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rns.dao.CarDao;
import com.rns.entity.Car;

@Service("carService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public int saveCar(Car car) {
		return (int)carDao.saveCar(car);
	}

	public List<Car> listOfCars() {
		
		return (List<Car>)carDao.listOfCars();
	}

	public void deleteCar(int carId) {
		// TODO Auto-generated method stub
		
	}

}
