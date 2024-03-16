package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi/controller")
public class SpringBootController {
	
	
	@GetMapping("/getHello")
	String testGetMethod() {
		
		return "Hello CODEBEGUN ";
	}
	
	

}
