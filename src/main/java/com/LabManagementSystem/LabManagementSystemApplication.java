package com.LabManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LabManagementSystemApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {

		SpringApplication.run(LabManagementSystemApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LabManagementSystemApplication.class);
    }
}
