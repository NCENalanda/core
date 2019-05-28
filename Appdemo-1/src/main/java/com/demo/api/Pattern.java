package com.demo.api;

import org.springframework.stereotype.Component;

@Component
public class Pattern {

	public void rightTriangle(int n) {
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void priamidInt(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void leftTriangle(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {System.out.print(" ");}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void equiTriangle(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {System.out.print(" ");}
			for(int j=1; j<=i; j++)      { System.out.print(i+" ");}
			
			System.out.println();
		}
	}
	

	public void equiTriangleIncre(int n) {
		int var1=11;
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {System.out.print("  ");}
			for(int j=1; j<=i; j++)      { System.out.print(var1+"  "); var1++;}
			
			System.out.println();
		}
	}

	public void equiTriangleIncreDecre(int n) {
	int var1=11;
	for(int i=1; i<=n; i++) {
		for(int j=n-i; j>0; j--) {System.out.print("  ");}
		for(int j=1; j<=i; j++){
			
		}
		
		System.out.println();
	}
}


}
