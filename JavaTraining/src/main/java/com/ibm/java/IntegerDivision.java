package com.ibm.java;

public class IntegerDivision {
	public static void main(String[] args) {
		int firstNo=0;
		int secondNo = 0;

		if (args.length < 2 || args.length > 2){
			System.out.println("2 inputs were not supplied");
		}else {
			try { 
				firstNo=Integer.parseInt(args[0]);
				secondNo=Integer.parseInt(args[1]);
				if (secondNo==0) {
					System.out.println("Attempted to divide by zero");
				}else {
					System.out.print("Quotient=" + firstNo/secondNo); 
				}
		    }catch(NumberFormatException e) { 
		          System.out.println("A non-integer input was given"); 
		          return;
		    }
		}

	}
}