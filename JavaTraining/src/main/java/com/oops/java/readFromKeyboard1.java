package com.oops.java;

import java.util.Scanner;

public class readFromKeyboard1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number...:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<10;i++){
			System.out.println((i+1) + " * " + n + " = " + (i+1)*n);
		}
	}
}
