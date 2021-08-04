package com.rns.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rns.entity.Car;

@Repository("carDao")
public class CarDaoImpl implements CarDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional(readOnly=false)
	public int saveCar(Car car) {
		
		this.hibernateTemplate.saveOrUpdate(car);
		return 1;
	}

	public List<Car> listOfCars() {
		return (List<Car>) hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Car").list();
		 
	}

	public void deleteCar(int carId) {
		// TODO Auto-generated method stub
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
