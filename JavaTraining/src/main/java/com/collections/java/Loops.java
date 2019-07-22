package com.collections.java;

public class Loops {

	public static void main(String[] args) {
		/*System.out.println("While Loop Example");
		System.out.println("================");
		int itr=10;
		int i=0;
		int j;
		while(i<itr){
			j=i+1;
			System.out.println("Value of Itr " + j + " is " + i);
			i=i+1;
		}*/
		
		System.out.println("For Loop Example");
		System.out.println("================");
		int itr=10;
		int j;
		for (int i=0; i<itr; i++){
			j=i+1;
			System.out.printf("Value of Itr %d is : %d\n", j, i);
			
		}
	}
}
