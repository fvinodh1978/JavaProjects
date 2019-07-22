package com.oops.java;

public class FinalDemo {
	String name="Edureka";
	final int cons; //blank final variable
	FinalDemo(){
		cons=10; //even if a local variable if declared as final cant be reassigned
	}
	public static void main(String[] args) {
		//Final Member data is like CONSTANTS and the value cant be changed
		//if a method is declared as final then we cannot override that method in sub class
		//if a class is created as final, we cannot create the child class
		//final member data without out initialisation is called blank final variable
		//blank final variable can be initialised only within the constructor
		//even if a local variable if declared as final cant be reassigned
		//abstract and final cant be given together
		FinalDemo obj = new FinalDemo();
		obj.name="edureka bangalore";
		System.out.println(obj.name);
		System.out.println(obj.cons);
		
		
	}

}
