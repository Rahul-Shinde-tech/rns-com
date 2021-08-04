package com.rns.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rns.bean.CarBean;
import com.rns.entity.Car;
import com.rns.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
	/*@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		Car car = new Car();
		model.addObject(car);
		model.setViewName("home");
		return model;
	}*/
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView WelcomePage(){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/addCar",method=RequestMethod.GET)
	public String addCar(Map<String,Object> model) {
		CarBean car = new CarBean();
		model.put("car",car);
		return "add";
	}
	
	/*@RequestMapping(value="/addCar",method=RequestMethod.GET)
	public ModelAndView addCar(ModelAndView model) {
		Car car = new Car();
		model.addObject("car",car);
		model.setViewName("add");
		return model;
		//return new ModelAndView("add");
	}*/
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveCar(@ModelAttribute CarBean carBean,BindingResult result ) {
		Car car = new Car();
		car= prepareModel(carBean);
		carService.saveCar(car);
		return new ModelAndView("redirect:/");
	}
	private Car prepareModel(CarBean carBean) {
		Car car = new Car();
		car.setCarName(carBean.getCarName());
		car.setCarColor(carBean.getCarColor());
		car.setCarPrice(carBean.getCarPrice());
		car.setCarQuantity(carBean.getCarQuantity());
		car.setCarId(carBean.getCarId());
		return car;
	}
	
	@RequestMapping(value="/listOfCars")
	public ModelAndView getCarDetails() {
		Map<String, Object> carMap = new HashMap<String, Object>();
		carMap.put("listofcars", prepareBeanModel(carService.listOfCars()));
		return new ModelAndView("list",carMap);
	}
	private Object prepareBeanModel(List<Car> listOfCars) {
		List<CarBean> carBeans =null;
		if(listOfCars!=null && !listOfCars.isEmpty()) {
			carBeans= new ArrayList<CarBean>();
			CarBean carBean = null;
			for(Car car:listOfCars) {
				carBean = new CarBean();
				carBean.setCarName(car.getCarName());
				carBean.setCarColor(car.getCarColor());
				carBean.setCarPrice(car.getCarPrice());
				carBean.setCarQuantity(car.getCarQuantity());
				carBean.setCarId(car.getCarId());
				
				carBeans.add(carBean);
			}
			
		}
		return carBeans;
	}
	
}
