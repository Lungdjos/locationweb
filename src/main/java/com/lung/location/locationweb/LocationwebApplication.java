package com.lung.location.locationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.lung.location.locationweb.entities")
public class LocationwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(LocationwebApplication.class, args);
	}

}
