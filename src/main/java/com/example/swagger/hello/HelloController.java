package com.example.swagger.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {
	
	@ApiModelProperty(notes = "Message")
	private String msg;

	@GetMapping("/")
	public String SayHi() {
		return "Hi";
	}
	
	@ApiOperation(value = "Hello Message")
//	@Api
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String SayHello() {
		return "Hi";
	}	
	
}
