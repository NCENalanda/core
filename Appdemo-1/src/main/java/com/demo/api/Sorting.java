package com.demo.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class Sorting {
	
	public List<Integer> sorting(List<Integer> listNo){
		
		listNo.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println(listNo.toString());
		return listNo;
	}
	
	
	public  List<Integer> unique(List<Integer> listNo){
		
		Set<Integer> set = new TreeSet<Integer>(listNo);
		System.out.println(set.toString());
		return listNo;
	}
	
	public List<Integer> convertArraytoList(int [] array){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}

}
