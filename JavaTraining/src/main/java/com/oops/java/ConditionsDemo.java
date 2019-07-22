package com.oops.java;

/*
if Condition
	Simple if Statement
	if else Statement
	nested if Statement
Switch Statement
While
*/
public class ConditionsDemo {
	public static void main(String[] args){
		//Simple if Statement
		int x=100, y=50;
		int lar=0;
		if (x>y){
			lar=100;
		}
		System.out.println("Largest Number is : " + lar);	
		//if else Statement
		int a=100, b=50;
		lar=0;
		if (a>b){
			lar=a;
		}else{
			lar=b;
		}
		System.out.println("Largest Number is : " + lar);	
		
		//Switch Statement 
		 int n=10;
		 switch(n){
		 case 0:
			 System.out.println("Number is Zero");
			 break;
		 case 1:
			 System.out.println("Number is One");
			 break;
		 case 2:
			 System.out.println("Number is Two");
			 break;
		 case 3:
			 System.out.println("Number is Three");	
			 break;
		 default:
			 System.out.println("Number not in range");
		 }	
	}
}
