package com.shrikar.springboot.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.shrikar.springboot")
public class StartMyBootApp{
	
	public static void main(String[] args) {
		SpringApplication.run(StartMyBootApp.class, args);
	}

}
