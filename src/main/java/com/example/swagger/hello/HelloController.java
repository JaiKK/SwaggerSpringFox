package com.example.swagger.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String SayHi() {
		return "Hi";
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String SayHello() {
		return "Hi";
	}	
	
}
