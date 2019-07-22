package com.collections.java;

//Program to find if a Number is Even Or Odd Number 
import java.util.Scanner;
class EvenOrOdd { 
   public static void main(String[] args) {
      System.out.print("Enter the Number: ");
	  Scanner readKey = new Scanner(System.in);
	  String inputStr = readKey.nextLine();
	  String[] inputNumbers = inputStr.split(",");
	  if (args[0] == "Odd"){
		  	System.out.print("Odd Numbers are : ");
			for (int i=1; i< inputNumbers.length; i++){
				if ( Integer.parseInt(inputNumbers[i]) % 2 != 0){
					System.out.print(inputNumbers[i] + ",");
				}
			}
	  }else{
				System.out.print("Even Numbers are : ");
				for (int i=1; i< inputNumbers.length; i++){
				if ( Integer.parseInt(inputNumbers[i]) % 2 == 0){
					System.out.print(inputNumbers[i] + ",");
				}
			}
	  }
   }
}