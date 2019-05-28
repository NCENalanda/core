package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import com.nt.person.Animal;
import com.nt.person.Employee;
import com.nt.person.Person;
import com.nt.person.Student;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plist=null;
		boolean flag=false;
		Person p=null, p1=null;
		p=new Person();
		p1=new Person(101 ,"Sikandar");
		plist=new ArrayList();
		plist.add(p);
		plist.add(new Person(101, "Sikandar"));
		plist.add(new Person(102, "Ayush"));
		plist.add(new Student());
		plist.add(new Employee(101, "R Rao", 2000));
	//plist.add(new Animal());
	//plist.add(new Integer(5));
		System.out.println(plist.toString());
		
		flag=plist.contains(p);
		System.out.println(flag);

		flag=false;
		flag=plist.contains(p1);
		System.out.println(flag);
		
		int i=plist.indexOf(p);
		System.out.println(i);
		 i=plist.indexOf(p1);
		System.out.println(i);
		System.out.println(plist.size());
	//	System.out.pri);
		
		
		

	}

}
