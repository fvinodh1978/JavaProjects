package com.oops.java;

public class AbstractImpDemo extends  AbstractClassDemo {
	public int area(int x, int y){
		
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassDemo obj = new AbstractImpDemo();
		System.out.println(obj.area(1, 2));
	}
}
