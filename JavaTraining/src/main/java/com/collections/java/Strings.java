package com.collections.java;

public class Strings {
	public static void main(String[] args) {
		System.out.println("String Examples");
		System.out.println("===============");
		String text="abc";
		System.out.println("Entered Text is : " + text);
		System.out.println("Length of String is : " + text.length());
		System.out.println("Character @ 3rd index is : " + text.charAt(2));	
		System.out.println("Index of bc : " + text.indexOf("bc"));	
		StringBuilder sb=new StringBuilder();
		sb.append("My Name is Vinodh,");
		sb.append("and i am an Engineer...");
		System.out.println(sb.toString());
		System.out.printf("Total Cost is :%9.1f", 123456.0);
		
		StringBuffer sbf=new StringBuffer();
		sbf.append("\nMy Name is Vinodh,");
		sbf.append("and i am an Engineer...");
		System.out.println(sbf.toString());
		System.out.printf("Total Cost is :%9.1f", 123456.0);
		
	}
}
