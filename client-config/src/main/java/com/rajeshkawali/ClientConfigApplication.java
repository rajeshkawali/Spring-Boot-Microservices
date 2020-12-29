package com.rajeshkawali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientConfigApplication.class, args);
	}

}
