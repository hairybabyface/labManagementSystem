package com.LabManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class LabManagementSystemApplication {

	private static final Logger LOGGER = Logger.getLogger(LabManagementSystemApplication.class.getName());

	public static void main(String[] args) {

		LOGGER.info("Running Application");

		SpringApplication.run(LabManagementSystemApplication.class, args);
	}

}
