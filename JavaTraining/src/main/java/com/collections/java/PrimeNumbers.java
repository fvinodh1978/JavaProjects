package com.collections.java;
//Program to find if a Number is a Prime Number 
import java.util.Scanner;
class PrimeNumbers { 
   public static void main(String[] args) {
      System.out.print("Enter the Number: ");
	  Scanner readKey = new Scanner(System.in);
	  int inputNum = readKey.nextInt();
	  String prime="Yes";
	  for(int i=2; i<=inputNum/2; i++){
			if(inputNum % i == 0){
                prime="No";
            }
       }
	  if (prime=="Yes"){
			System.out.println("Entered Number : " + inputNum + " is a Prime Number");
	  }
	  else{
			System.out.println("Entered Number : " + inputNum + " is Not a Prime Number");
	  }
   }
}