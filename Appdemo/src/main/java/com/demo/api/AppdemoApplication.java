package com.demo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.api.sort1.HashSort;

@SpringBootApplication
public class AppdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdemoApplication.class, args);
	}
	
	@Bean
	
	public CommandLineRunner demo (HashSort sort) {
		return (args)->{
			sort.main();
		};
	}

}
