package com.collections.java;

//Program to find if a Number is Even Or Odd Number 
import java.util.Scanner;
class Even { 
   public static void main(String[] args) {
      System.out.print("Enter the Number: ");
	  Scanner readKey = new Scanner(System.in);
	  int inputNum = readKey.nextInt();
	  String even="No";
	  if(inputNum % 2 == 0){
		System.out.println("Entered Number : " + inputNum + " is an Even Number");
          }
	  else{
		System.out.println("Entered Number : " + inputNum + " is an Odd Number");
	  }
   }
}