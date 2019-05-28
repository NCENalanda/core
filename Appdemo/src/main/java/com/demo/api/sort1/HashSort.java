package com.demo.api.sort1;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

	@Service
	public class HashSort {

		
		private static final Logger log = LoggerFactory.getLogger(HashSort.class);

	    // Complete the countSwaps function below.
	    static void countSwaps(int[] a) {
	    	int i,count=0,temp;//5
	    	for ( i = 0; i < a.length; i++) {
	    		
				for (int j = 0; j < a.length-1; j++) {
					 
					if(a[j]>a[j+1]) { temp=a[j];  a[j]=a[j+1]; a[j+1]=temp; count++;}
					
				}
			}

	    	show(a);
	    	
	    	log.info("     NO_OF_SWAPS   "+count);
	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main() {
	    	log.info("Enter The Size Of Array ");
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] a = new int[n];

	        log.info("Enter Element Of Array ");
	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        countSwaps(a);

	        scanner.close();
	    }
	    
	    private static void show(int []a) {
	    	log.info("   ::   Sorted Element    ::   ");
	    	for (int i : a) {
				log.info(i+"");
			}
	    }
	}


