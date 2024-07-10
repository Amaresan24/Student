package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "It Is My Application", version = "3.0", description = "it is my swagger project"))
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}


}
