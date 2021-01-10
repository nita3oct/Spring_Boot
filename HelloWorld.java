package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/First")
public class HelloWorld {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)

	public String hello() {
		return "Hello World RESTful API with Spring Boot";
	}

	@RequestMapping(value = "/second", method = RequestMethod.POST)

	public Emloyee second(@RequestBody Emloyee emp) {
		System.out.println("" + emp.getName());
		return emp;
	}

	@GetMapping("/third")
	@ResponseBody
	String getthird(@RequestParam String name) {
		return "name: " + name;
	}
	
	
	@GetMapping("/fourth")
	@ResponseBody
	public String getFoos(@RequestParam(defaultValue = "test") String id) {
	    return "ID: " + id;
	}
	
	
	
		  @GetMapping("/hello0/{name}")
		
		public String hello0(@PathVariable("name") String name)
		
		{
		
		    return "Hello " + name;
		
		}

	
	

}
