package com.oops.java;

public class StringsDemo {	
	int abc=100;
	public int add(int x, int y){
		int value=x+y;
		return value;
	}
		
	public static void main(String[] args) {
		//Literal are created in String Constant Pool Memory
		//Objects are created in heap Memory
		String s= "  Edureka";
		s=s.trim();
		System.out.println(s);
		
		StringsDemo sd = new StringsDemo();
		System.out.println(sd.add(1,  2));

	}
}
