package com.sandeep.ws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/m2")
@Api(value = "Second Micro Service", description = "It send hello to first microservice")
public class SecondMicroServiceController {
	
	
	
	@GetMapping(path="/get")
	@ApiOperation(value = "send <hello> as response", response = ResponseEntity.class)
	public ResponseEntity<String> getGreeting() {
		
		String greeting = "Hello";
		
		return new ResponseEntity<String>(greeting,HttpStatus.OK);
		
	}

}
