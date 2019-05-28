package com.demo.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Comparing {
	
	public static int getShortest(int arr []) {
		Set<Integer> set = new TreeSet<>();
		int j =0;
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		//Spliterator<Integer> spl =set.spliterator();
		Iterator<Integer> spl = set.iterator();
		while (spl.hasNext()) {
			 j = spl.next();
			 break;
			
		}
		return j;
	}

	public static int[] getDuplicate(int num[]) {
		//Set<Integer> set = new TreeSet<>();
		//Map<Integer, Integer> map = new TreeMap<>();
		Map<Integer, Integer> map = new HashMap<>();
		int count=1, k =0,k1;
		for (int i = 0; i < num.length; i++) {
			if(!map.containsKey(num[i])) { map.put(num[i], count);}
			else { 
				k = map.get(num[i]);
				k++;
				map.put(num[i], k);
				System.out.println("Else Block :"+ num[i]+ " k: "+ k);}
			  
		}
		//Set<Integer> set1 = map.
		TreeSet<Integer> tree = new TreeSet<>(map.values()) ;
		List<Integer> list = new ArrayList<>();
	    for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
	    	k1 = (int) iterator.next();
			k = map.get(k1);
			System.out.println("Frist : "+ tree.last());
			if(k>=tree.last()) {
				list.add(k1);
			}
			
		}
		System.out.println("Map : "+ map.toString());
		System.out.println("List : " + list.toString());
		System.out.println("Treeset : "+ tree.toString());
		return null;
	}
}
