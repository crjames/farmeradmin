package com.farmerassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.farmerassistant")
public class FarmeradminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmeradminApplication.class, args);
	}
}
