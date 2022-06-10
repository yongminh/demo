package com.ez.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	
	public String test() {
		System.out.println("test by hong");
		
		return "/index";
	}
}
