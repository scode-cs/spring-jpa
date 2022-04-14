package com.scode.springjpa.application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.scode.springjpa")
@EntityScan("com.scode.springjpa.entity")
@EnableJpaRepositories("com.scode.springjpa.repository")
@OpenAPIDefinition(info = @Info(title = "Spring JPA", version = "1.0",
		description = "API for Spring JPA"))
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
