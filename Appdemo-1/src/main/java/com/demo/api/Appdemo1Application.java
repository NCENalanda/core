package com.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Appdemo1Application {
	
	

	public static void main(String[] args) {
		SpringApplication.run(Appdemo1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(Common com) {
		return (args ) -> {
			//com.resultPrime();
			//com.resultSorting();
			 //com.resultStringOperation();
			//com.resultRecursion();
			//com.resultCalucator();
			//com.resultMartix();
			//com.resultPattern();
			com.resultComparing();
			//com.resultReverse();
		};
	}
	
	

}
