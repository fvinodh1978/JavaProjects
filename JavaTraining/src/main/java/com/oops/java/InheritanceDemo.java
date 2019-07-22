package com.oops.java;
	//Process of creating an new class using an existing class
	//Modularity and Reusability of existing code are advantage of Inheritance
	//Single Inheritance 
	//	Sinple Inheritance
	//	Hirecharical Inheritance
	//	Multi Level Inheritance
	//Multiple Inheritance
	//	Multiple Inheritance
	//	Hybrid Inheritance
	//Super/Parent and Sub/Child
	//If there are same function in different Parent, then Ambiguity error - so inheritance can extend only one Parent
	//So Multiple inheritance is not possible through classes but is possible thru Interface


public class InheritanceDemo extends Utilities{
	public int subtract(int a, int b){
		return a-b;
		
	}
	public static void main(String[] args) {

		InheritanceDemo id = new InheritanceDemo();
		int sum = id.add(1,  2);
		int sub = id.subtract(1,  2);
		System.out.println("Sum of 1, 2, is : "+ sum);
		System.out.println("Value of 2-1 is : "+ sub);
	}
}
