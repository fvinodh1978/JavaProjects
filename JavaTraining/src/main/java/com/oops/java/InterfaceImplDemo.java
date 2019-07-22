package com.oops.java;

public class InterfaceImplDemo implements Interface1Demo , Interface2Demo{
	
	public int area(int x, int y){
		return x*y;
	}
	public int intrest(int principal, int year, int rate){
		return principal*year*rate/100;
	}
	
	public int add(int x, int y){
		return x*y;
	}
	public int subtract(int a, int  b){
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplDemo obj = new InterfaceImplDemo();
		System.out.println("Area of is " + obj.area(1,  2));
		System.out.println("Intrest of is " + obj.intrest(10,  10,  10));
		System.out.println(obj.add(10,  10));
		System.out.println(obj.subtract(10,  10));
		System.out.println(Interface1Demo.cons);
	}
}
