package com.xpandit.barmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BarMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarMicroserviceApplication.class, args);
	}

}
