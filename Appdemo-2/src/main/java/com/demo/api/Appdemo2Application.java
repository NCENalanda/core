package com.demo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.api.controller.Control;

@SpringBootApplication
public class Appdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Appdemo2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(Control control ) {
		return (args ) -> {
			System.out.println("SERVICE STARTED");
			control.controls();
			};
		}

}
