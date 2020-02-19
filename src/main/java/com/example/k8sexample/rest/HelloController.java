package com.example.k8sexample.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello/cloud")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello example", HttpStatus.OK);
	}

}
