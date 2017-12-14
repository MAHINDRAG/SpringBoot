package com.app.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping("/rest")
	public String Welcome(){
		return "Welcome to Spring Boot tutorials";
	}
	
	@RequestMapping("/hello")
	public String myData(){
		return "Hello Spring Boot";
	}

}
