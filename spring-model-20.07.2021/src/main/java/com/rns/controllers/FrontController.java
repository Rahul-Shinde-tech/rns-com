package com.rns.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	
	@RequestMapping("/home")
	public ModelAndView display() {
		System.out.println("Inside View Resolver DIsplay method:");
		ModelAndView modelandview = new ModelAndView();
		List<String> names = new ArrayList<String>();
		names.add("Sachin Tendulkar");
		names.add("Virendra Sehwagh");
		modelandview.addObject("name",names);
		modelandview.setViewName("display");
		return modelandview;
	}
}
