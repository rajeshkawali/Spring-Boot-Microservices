package com.rajeshkawali.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackMethodController {

	
	@RequestMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than Expected." +
                " Please try again later";
    }
	
	@RequestMapping("/employeeServiceFallBack")
    public Mono<String> employeeServiceFallBack() {
        return Mono.just("Employee Service is taking too long to respond or is down. Please try again later");
    }
}
