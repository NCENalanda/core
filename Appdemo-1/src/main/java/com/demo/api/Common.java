package com.demo.api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Common {
	
	@Autowired
	private PrimeNumber prime;
	
	@Autowired
	private Sorting sorted;

	@Autowired
	private StringOpterion sOpration;
	
	@Autowired
	private Recursion recur;
	
	@Autowired
	private Calculator cal;
	
	@Autowired
	private Matrix mat;
	
	@Autowired
	private Pattern pat;
	
	public void resultPrime() {
		System.out.println("Sum of prime");
		System.out.println(prime.findPrime());
		System.out.println("Total loop1 :"+prime.count);
		System.out.println("Size : "+prime.list.size());
		
		
		/*System.out.println(this.isPrime(list).toString());
		System.out.println("Size : "+this.isPrime(list).size());
		System.out.println();*/
		
		
		System.out.println(prime.findPrimeNo());
		System.out.println("Size : "+prime.list.size());
		System.out.println("Total loop2 : "+prime.count);
		
		//System.out.println("10th : "+this.findNthPrimeNo(1));
	}
	
	public void resultSorting() {
		List<Integer> listNo = new ArrayList<>();
		listNo.add(10); listNo.add(50); listNo.add(40); listNo.add(30); listNo.add(10);
		listNo.add(30); listNo.add(20); listNo.add(20); listNo.add(90); listNo.add(80);
		listNo.add(70); listNo.add(60); listNo.add(50); listNo.add(90); listNo.add(70);
		
		//sorted.unique(sorted.sorting(listNo));
		
		
		int [] array = {10,20,90,80,50,10,80,60,50,90,40,30,40,110,180,170,170,180,150,110,100,150,120,130,30,60,160,120,70,80,90,20,140};
		
		sorted.unique(sorted.sorting(sorted.convertArraytoList(array)));
		
	}
	
	public  void resultStringOperation() {
		
		String str="deereterusdgdfhssfdhynfmu.bGRHZSSCFNJCSFDY6O90]"
				+";;;.,[]*()(_)@!@%&@^@^^#`"
				+ "as	1-]-=o7letqTYTHEARH";
		
		//sOpration.convert_String_To_List(str);
		
		//System.out.println("Sorted : "+sOpration.sort_Of_ListChar(sOpration.convert_String_To_List(str)));
		
		//System.out.println("Unique : "+sOpration.unique_Of_ListChar(sOpration.sort_Of_ListChar(sOpration.convert_String_To_List(str))));
	}
	
	public void resultRecursion() {
		System.out.println(recur.getResult());
	}
	
	public void resultCalucator() {
		String str = "1+2+78+56-89*34/3";
		cal.parse(str);
	}
	
	public void resultMartix() {
		//System.out.println(mat.convertIntoList(mat.getMatrix(5,4)).toString());
		mat.show(mat.getMatrix(4, 3));
		mat.show(mat.getMatrix(3, 5));
		
		//System.out.println('\n'+"Tranversal"+'\n');
		//mat.show(mat.transvel(mat.getMatrix(3, 5)));
		
		System.out.println('\n'+"Product"+'\n');
		
		mat.show(mat.product(mat.getMatrix(4, 3), mat.getMatrix(3, 5)));
	}
	
	public void resultPattern() {
		//pat.rightTriangle(10);
		//pat.priamidInt(9);
		//pat.leftTriangle(9);
		//pat.equiTriangle(8);
		pat.equiTriangleIncre(9);
	}
	
	public void resultComparing() {
		int [] abc = {10,20,30,40,50,0,-1,-90,23,40,-300,89,-800,-300, 10, -1, 40, 23, -300};
		int res = 0;
		// res = Comparing.getShortest(abc);
		
		Comparing.getDuplicate(abc);
		System.out.println( "ShorestNo. " + res);
	}
	
	public void resultReverse() {
		String str = "QWERTYvfdfhfgn";
		//str= StringOpterion.getReverse(str);
		
		//str = "abcba";
		//str = StringOpterion.palindrome(str);
		
		str = " ABC DEF GHI JKL MNO PQR STU VWX YZ"; 
		String strArray [] = StringOpterion.getWord(str);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" :   " + strArray[i]);
		}
		System.out.println("Reverse String : " + str);
	}
}
