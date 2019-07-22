package com.collections.java;
class Prime100 { 
	//Program to Print first 100 Prime Numbers
public static void main(String[] args) {
	int count=1;
	int number=2;
	String prime="Yes";
	System.out.println("Count            Number");
	while (count<=100) {
		for(int i=2; i<=number/2; i++){
			if(number % i == 0){
                prime="No";
            }
		}
		if (prime=="Yes"){
			System.out.println(count + "   " + number);
			count=count+1;
		}
		number=number+1;
		prime="Yes";
	}
}
}