package com.collections.java;
//Program to find if a Number is Even Or Odd Number 
import java.util.Scanner;
class PassbyValue { 
	static int i , j;
	void swap(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		i=a;
		j=b;
	}
	PassbyValue(int a, int b){
		i=a;
		j=b;
	}
	public static void main(String[] args) {
		Scanner readKey = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = readKey.nextInt();
		System.out.print("Enter the Number: ");
		int b = readKey.nextInt();
		PassbyValue pbv=new PassbyValue(a, b);
		System.out.println("Before Swapping, a = : " + i + "b = : " + j );
		pbv.swap(a, b);
		System.out.println("After Swapping, a = : " + i + "b = : " + j );
   }
}