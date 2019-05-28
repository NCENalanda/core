package com.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumber {
	
	public int count;
	public double sum;
	public List<Integer> list = new ArrayList<>();
	
	public double findPrime() {
		this.count = 0;
		this.sum = 0;
		this.list.clear();
		final int Range = 100;
		boolean flag=false;
		
		//List<Integer> list= new ArrayList<>();
		for(int i=1; i<=Range;i++) {
			//int ran=i/2;
			//System.out.println("i :  "+i);
			
			// Reduce the loop
			if(i>=8) {
				//System.out.println("i : "+i);
				if(i%2==0) {continue;}
				if(i%3==0) {continue;}
				if(i%5==0) {continue;}
				if(i%7==0) {continue;}			
				}//end of if
			
		
			int reduceLoop = i/2+1;
			for(int j=2; j<reduceLoop; j++) {
				//System.out.println("i : "+i);
				if(i%j == 0 && !flag) {flag =true;}
				this.count++;
			}//end of inner for
			//}//end of else
			if(!flag) {
				this.sum= this.sum+i;
				this.list.add(i);
			}
			flag=false;
		}//end of outer for
		System.out.println(list.toString());
		return sum;
	}//end of method
	
	public double findPrimeNo() {
		this.count = 0;
		this.sum = 0;
		this.list.clear();
		final int Range = 100;
		boolean flag=false;
		
		for(int i=1; i<=Range;i++) {
		
			for(int j=2; j<i; j++) {
				if(i%j == 0 && !flag) {
					//System.out.println(i);
					flag =true;
				}
				this.count++;
			}//end of inner for
			
			if(!flag) {
				//System.out.println(i);
				this.sum= this.sum+i;
				list.add(i);
			}
			flag=false;
		}//end of outer for
		System.out.println(list.toString());
		return sum;
	}
	
	public  List<Integer> isPrime(List<Integer> listPrime){
	 
		this.count = 0;
		this.sum = 0;
		this.list.clear();
		
		listPrime.forEach(arg ->{
		
			boolean flag = false;
			for(int i=2; i<arg; i++) {
				if(arg%i==0) {  flag = true;}
			}
			
			if(!flag) {
				list.add(arg);
			}
	 });
		
		return list;
	}
	
	public int findNthPrimeNo(int nth) {
	this.count=0;	

	boolean flag=false;
		
		for(int i=1; ;i++) {
		
			for(int j=2; j<i; j++) {
				if(i%j == 0 && !flag) {
					flag =true;
				}
			}//end of inner for
			
			if(!flag) {
				this.count++;
				if(count==nth)
					return i;
			}
			flag=false;
		}//end of outer for
		
		
	}

}
