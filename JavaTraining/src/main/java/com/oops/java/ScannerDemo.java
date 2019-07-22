package com.oops.java;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {		
		System.out.println(Character.CURRENCY_SYMBOL);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.TYPE);
		        
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>1?"Yes":"No");
		//System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1) + " " + Character.toUpperCase(B.charAt(0))+B.substring(1));  
		/*sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
		  sdkfhsdkfhsdkfhsdfhsdfjeaDFHSD*/
		System.out.println("Unicode of l is :" + Integer.toHexString('l'));
		System.out.println("Unicode of l is :" + Integer.toHexString('k'));
	}
}
