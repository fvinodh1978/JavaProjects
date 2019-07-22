package com.collections.java;

import java.util.Scanner;

public class ScannerExample{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int integer;
		long longInteger;
		float realNumber;
		double doubleReal;
		String string1;
		System.out.println("Enter an integer, a long integer, a floating-point ");//Prompt
		System.out.println("number, another floating-point number, and a string.");
		System.out.println("Separate each with a blank or return.");   

		integer = input.nextInt();// Read in values 
		longInteger = input.nextLong();
		realNumber = input.nextFloat();
		doubleReal = input.nextDouble();
		string1 = input.nextLine();
		System.out.println("Here is what you entered: ");
		System.out.println(integer + " " + longInteger + " " + realNumber +

                       " " + doubleReal + " " + string1);
		input.close();
  }

 

}