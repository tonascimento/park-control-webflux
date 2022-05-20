package com.api.parkcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkControlApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hellow";
	}
}
