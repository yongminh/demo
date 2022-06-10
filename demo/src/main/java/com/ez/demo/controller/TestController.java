package com.ez.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	
	public String test() {
		System.out.println("test by hong");
		System.out.println("hello by chief");
		System.out.println("hi!");
		return "/index";
	}
}
