package com.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Matrix {
	
	public int[][] getMatrix(int row, int col){
		 int abc[][] =  new int [row][col];
		//int  abc [][]= {{1,2,3},{4,5,6},{7,8,9}};
		  int var=10;
		 for(int i=0;i<row;i++) {
			 for( int j=0; j<col; j++) {
			 abc[i][j] =var;
			 //var=var+10;
			 var+=10;
			 }
			 var = var*(i+1);
			 
		 }
		return abc;
	}
	
	public List<Integer> convertIntoList(int abc[][]){
		List<Integer> listArr= new ArrayList<>();
		for(int i=0; i<abc.length; i++) {
			
			for(int j=0; j<abc[i].length; j++) {
				listArr.add(abc[i][j]);
			}
			
		}
		return listArr;
	}
	
	public void show(int abc[][]){
		
		System.out.println();
		for(int i=0; i<abc.length; i++) {
			
			for(int j=0; j<abc[i].length; j++) {
				System.out.print("           "+abc[i][j]);
			}
			
			System.out.println();
			
		}
		return;
	}
	
	public int[][] transvel(int [][] abc){
		int [][] xyz = new int [abc.length][abc[0].length];
		
		for(int i=0; i<abc.length; i++) {
			
			for(int j=0; j<abc[i].length; j++) {
				xyz[j][i]= abc[i][j];
				
			}// end of inner for loop
					
		}// end of outer for loop
		return xyz;
		
	}
	
	public int[][] product(int [][] abc, int [][] abc1){
		
		if(!(abc[0].length==abc1.length)) {
			throw new RuntimeException("Cartision is not same");
		}
		int [][] xyz = new int [abc.length][abc1[0].length];
		System.out.println("col : "+xyz.length+"  row  "+xyz[0].length);
		for(int i=0; i<xyz.length; i++) {
			
			for(int j=0; j<xyz[i].length; j++) {
				for(int k=0; k<abc[0].length; k++) {
					xyz[i][j] += abc[i][k] * abc1[k][j];
					System.out.println("k: "+k+"  : "+xyz[i][j]);
				}
			}// end of inner for loop
					
		}// end of outer for loop
		return xyz;
		
	}
	
	

}
