package com.rns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
		
	@RequestMapping("/new")
	public String display() {
		
		System.out.println("This is display Controller:");
		return "frontpage";
	}
}
