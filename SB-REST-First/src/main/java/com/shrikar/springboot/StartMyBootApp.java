package com.shrikar.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.shrikar.springboot"})
public class StartMyBootApp extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(StartMyBootApp.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartMyBootApp.class);
	}

}
