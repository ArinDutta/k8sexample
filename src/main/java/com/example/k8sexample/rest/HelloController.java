package com.example.k8sexample.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@GetMapping("/hello/cloud")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>(welcomeMessage, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity info(){
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
