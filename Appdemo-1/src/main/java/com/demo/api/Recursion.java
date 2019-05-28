package com.demo.api;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Recursion {
	

	public Scanner scn = new Scanner(System.in);
	private int total;
	
	public int getResult() {
		System.out.print("Enter No : ");
		String str = scn.next();
		if(str.equalsIgnoreCase("Exist"))
			return total;
		int i = Integer.parseInt(str);
		this.sum(i);
		return total;
	}
	
	public int sum(int i){
		
		total= i + total;
		this.getResult();
		return total ;
	}

}
