package com.ez.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "홍길동");
		
		return "thymeleaf/hello";
	}

	@GetMapping("/api_string")
	@ResponseBody
	public String apiString(@RequestParam("name") String name) {
		return "hello " + name;

		//http://localhost:9091/api_string?name=hong
	}

	@GetMapping("/api_object")
	@ResponseBody
	public Person apiObject(@RequestParam("name") String name) {
		Person p = new Person();
		p.setName(name);
		
		return p;		
		
		//http://localhost:9091/api_object?name=hong
		
		//=> {"name":"hong"}
	}

	//jsp
	@RequestMapping(value="/")
    public String index(Model model) {  
		model.addAttribute("title", "main페이지");
		
		Person p = new Person();
		p.setName("김길동");
		String name=p.getName();
		
		model.addAttribute("name", name);
		
        return "index";
    }

}
