package com.collections.java;

public class Objects extends Utilities{
	
	public Objects() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws Exception{
		System.out.println(Utilities.LUCKY_NUMBER);	
		Utilities MyUtil1 = new Utilities();
		System.out.println(MyUtil1.objectCount);
		Utilities MyUtil2 = new Utilities();
		System.out.println(MyUtil2.objectCount);
		Utilities MyUtil3 = new Utilities();
		System.out.println(MyUtil2.objectCount);	
		Utilities MyUtil4 = new Utilities();
		System.out.println(MyUtil4.id);
		System.out.println("Limit Reached...");
		Utilities MyUtil5 = new Utilities();
		System.out.println(Utilities.objectCount);
		MyUtil5.add2num(1,2);
		MyUtil5.num1=2;
		System.out.println(MyUtil5.id);
		System.out.println(Utilities.id);
		
	}
}
