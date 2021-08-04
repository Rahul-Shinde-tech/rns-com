package com.rns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
		@RequestMapping("/hm")
		public String display(Model model) {
			System.out.println("Inside the Spring Controller!");
			model.addAttribute("name","Rahul Dravid");
			
			return "home";
		}
		
		@RequestMapping("tr")
		public ModelAndView disp() {
			System.out.println("Inside the Disp Controller");
			ModelAndView modelandview = new ModelAndView();
			modelandview.addObject("name","Sachin Tendulakr");
			modelandview.setViewName("display");
			return modelandview;
			
		}
}
