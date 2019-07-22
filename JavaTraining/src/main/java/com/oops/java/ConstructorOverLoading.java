package com.oops.java;

public class ConstructorOverLoading {
	int empno;
	String ename;
	double sal;
	
	ConstructorOverLoading(int empno, String ename, double c){
		this.empno=empno;
		this.ename=ename;
		sal=c;
	}
	

	void display(){
		System.out.println("No Argument Method");
	}
	void display(int x){
		System.out.println("One Argument Method");
	}
	public static void main (String[] args){
		ConstructorOverLoading obj1=new ConstructorOverLoading(100, "Vinodh", 100000.00);
		System.out.println("Employee No is : " + obj1.empno + ", Employee Name is : " + obj1.ename + ", Employee Name is : " + obj1.sal);
		
	}

}
