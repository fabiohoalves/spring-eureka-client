package com.falves.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HelloWorldController {
	

	@GetMapping("/hello-worlds/{name}")
	public String getHelloWorld (@PathVariable String name)
	{
		return "Hello World "+name;
	}

}
