package com.oops.java;

import java.util.Scanner;

/*Function/Method is a reusable code block

 */

public class Methods1 {
	public static void printFunction(){
		System.out.println("This is my Sample Function Program...");
	}
	public static int addNum(int a, int b){
		return a+b;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		printFunction();
		System.out.println("Enter 2 Integers...");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();		
		System.out.println("Sum of " + a + " and " + b + " is :" + addNum(a,b));
		
	}
}
