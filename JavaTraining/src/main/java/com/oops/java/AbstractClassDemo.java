package com.oops.java;

abstract public class AbstractClassDemo {
	
	public int a=10, b=20;
	public void addnum(int x, int y){
		System.out.println("Sum = " + (x+y));
	}
	abstract public int area(int a, int b);

	public static void main(String[] args) {
		//We cannot create an instance of Abstract class because it is incomplete or it is not a concrete class
		//in Abstract class, method without body is called abstract method
		//if in a class a abstract method exist then that class is Abstract class
		//Abstract is used to declare the abstract Method
		//if atleast 1 method is abstract, then class should be abstract

	}

}
