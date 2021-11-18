package com.sampleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@Autowired
	private Environment environment;
	
	public HelloWorldController(Environment environment) {
		this.environment = environment;
	}
	
	@GetMapping("/")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello World service running on port: "+ environment.getProperty("local.server.port"));
	}
	
}
