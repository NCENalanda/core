package com.demo.api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ArrayMethodUtil implements IUtil {

	
	private static final Logger log = LoggerFactory.getLogger(ArrayMethodUtil.class);

	//private IUtil iUtil;
	
	@Override
	public Integer [] getArray(int length) {
		Integer [] integers = new Integer[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			 integers[i]  = random.nextInt(10000);
		}
		return integers;
	}
	
	@Override
	public Integer[]  sort(Object[] array1, Object obj) {
		
		if (obj instanceof Integer) { return sort1((Integer[]) array1); }
		
		return null;
	}
	
	public Integer[] sort1(Integer[] array) {
		
		List<Integer> integers = new ArrayList<>();
		
		for (Integer integer : array) {
			integers.add(integer);
		}
		
		Collections.sort(integers);
		Integer[] iArray = new Integer[integers.size()];
		iArray = integers.toArray(iArray);
		return iArray;
	}
	
public Integer[] sort2(Integer[] arr) {
		/*int temp = 0;
		Integer[] i1 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>=temp) { temp = arr[i];	}
				else { }
				
			}
		
			
		}*/
		return null;
	}
	@Override
	public void display(Object[] array1) {
		log.info("Array  Printing");
		List<Object> list = new ArrayList<>();
		for (Object object : array1) {
			//log.info(object.toString());
			list.add(object);
		}
		
		log.info(list.toString());
	}
}
