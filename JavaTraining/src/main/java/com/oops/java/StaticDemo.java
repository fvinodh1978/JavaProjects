package com.oops.java;

public class StaticDemo {
	static int x= 230;
	public int y=100;
	int c= 10;
	void inc(){
		c=c+1;
	}
	static int z=10;
	void inc1(){
		z=z+1;
	}
	
	public static void DisplayMessage(){
		System.out.println("Inside Static Method");
	}
	static{
		System.out.println("Inside Static Block");
	}
	public static void main(String[] args) {
		//Static Member variable/method can be accessed using class name itself , Object is not required
		//Static attribute/method/block is from class not from object
		//Static member is initialised(memory is alloted)
		//static block is executed before main method
		//any number of static blocks can be given
		//Static Member data is shared by all the objects
		System.out.println("Static variable x can be accessed using object name itself : " + StaticDemo.x);
		System.out.println("Member variable y cant be accessed inside  is ");
		
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		System.out.println("Member data is not shared by all the objects...");
		s1.inc(); s2.inc(); s3.inc();
		System.out.println(s1.c + " " +  s2.c + " " +  s3.c);
		
		System.out.println("Static Member data is shared by all the objects...");
		s1.inc1(); s1.inc1(); s1.inc1();
		System.out.println(StaticDemo.z + " " +  StaticDemo.z + " " +  StaticDemo.z);
	}

}
