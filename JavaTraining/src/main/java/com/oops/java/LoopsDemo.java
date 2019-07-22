package com.oops.java;

public class LoopsDemo {
	public static void main (String[] args){
		System.out.println("while loop Demo...........\n");
		//while Loop -- Execute 0 or more than 0 times
		//While Loop should have a condition : while() is invalid
		int i = 0;
		while (i < 5){
			System.out.println("Value of " + i + " is : " + i);
			i++;
		}
		
		System.out.println("for loop Demo...........\n");
		//For loop (Initialisation;Condition;inc/dec)
		//Not Purely Condition Based for(;;) will be a infinite loop
		for(i=0;i<5;i++){
			System.out.println("Value of " + i + " is : " + i);
		}
		
		//While Loop with ;
		int j=1;
		while (j++<=5);
		System.out.println("Value of j is : " + j);
		
		//Do While -- Execute 1 or more than 1 times
		System.out.println("\ndo while Demo...........\n");
		i=1;
		do{
			System.out.println("Value of " + i + " is : " + i);
			i++;		
		}while (i<5);
		
		//Extended for loop jdk1.5
		int[] myArray ={1, 2, 3, 4, 5, 6};
		for (int x : myArray){
			System.out.println("Value is " + x);
		}
	}
}
