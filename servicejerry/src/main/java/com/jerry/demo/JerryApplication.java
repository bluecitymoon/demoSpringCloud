package com.jerry.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JerryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerryApplication.class, args);
	}
}
