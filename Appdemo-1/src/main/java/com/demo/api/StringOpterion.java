package com.demo.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

@Component
public class StringOpterion {

	public List<Character>  convert_String_To_List(String str){
		
		char [] charArray = str.toCharArray();
		int len= charArray.length;
		List<Character> listChar= new ArrayList<>();
		for(int i=0; i<len; i++) {
			listChar.add(charArray[i]);
		}
		System.out.println(listChar.toString());
		return listChar;
	}
	
	public List<Character> sort_Of_ListChar(List<Character> listChar){
		  listChar.sort(new Comparator<Character>() {

			@Override
			public int compare(Character arg0, Character arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
		});
		  
		  return listChar;
	}
	
	
	public List<Character> unique_Of_ListChar(List<Character> listChar){
		Set<Character> setChar = new TreeSet<>(listChar);
		List<Character> list= new ArrayList<>(setChar);
		return list;
		
	}
	
	public List<String> convertIntoList(String str){
		
		return null;
	}
	
	public static String getReverse(String str) {
		char [] ch = str.toCharArray();
		String str1 = "";
		int i = ch.length-1;
		for (  ; i>=0; i--) {
			str1 = str1+ch[i];
		}
		return str1;
	}
	
	public static String palindrome(String str ) {
		char [] ch = str.toCharArray();
		String msg = "YES";
		int len = ch.length-1;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] != ch[len]) { msg = "NO";}
			len--;
		}
		return msg;
	}
	
	public static String[] getWord(String str) {
		 int NUM_OF_String = 10;
		//String [] str1 = str.split(" ",NUM_OF_String);
		String [] str1 = str.split(" ");
		return str1;
	}
}
