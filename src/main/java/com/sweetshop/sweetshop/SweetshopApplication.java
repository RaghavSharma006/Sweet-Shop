package com.sweetshop.sweetshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sweetshop.sweetshop.repository")
public class SweetshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetshopApplication.class, args);
	}
}
