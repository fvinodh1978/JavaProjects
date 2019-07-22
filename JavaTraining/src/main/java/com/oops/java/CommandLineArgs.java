package com.oops.java;

public class CommandLineArgs{
	public static void main(String args[]){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[0]);
		}catch(ArithmeticException e){
			System.out.println("Exception : Cannot divide a number by Zero");
		}

	}
}
