package com.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Autowired
	private StringOpterion opt;
	
	public void  parse(String str) {
		List<String> listStr= new ArrayList<>();
		List<Character> listChar= opt.convert_String_To_List(str);
		//listChar.forEach(System.out::println);
		listChar.forEach(arg0 ->{
			
			if(arg0=='+') {	System.out.println("Add : "+arg0); listStr.add(""+arg0);	}
			if(arg0=='-') {	System.out.println("Sub : "+arg0);	listStr.add(""+arg0);   }
			if(arg0=='*') {	System.out.println("Mul : "+arg0);	listStr.add(""+arg0);   }
			if(arg0=='/') {	System.out.println("Div :"+arg0);	listStr.add(""+arg0);   }
			else {	System.out.println(arg0);	}
		});
		
		System.out.println("String ");
		listStr.forEach(System.out::println);
	}

}
