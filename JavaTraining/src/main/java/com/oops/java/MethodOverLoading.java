package com.oops.java;

public class MethodOverLoading {
	//Method Name along with arguments details is called as Method Signature
	//Method calling Signature should match with Method definition Signature
	void display(){
		System.out.println("No Argument Method");
	}
	void display(int x){
		System.out.println("One Argument Method");
	}
	public static void main (String[] args){
		MethodOverLoading obj1=new MethodOverLoading();
		obj1.display();
		obj1.display(1);
		
		
		
	}
}
