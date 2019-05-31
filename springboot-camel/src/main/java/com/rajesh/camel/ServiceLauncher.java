package com.rajesh.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.rajesh.camel")
public class ServiceLauncher {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceLauncher.class, args);
	}
}