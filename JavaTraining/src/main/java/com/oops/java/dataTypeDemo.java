package com.oops.java;

public class dataTypeDemo {

	public static void main(String[] args){
		
		 /*DataType : Keyword in java used to declare a variable to specify the type of data to be stored and to allocate memory
		 	1. Primitive Datatype/Fundamental Datatypes
		 		Numeric -- used for declaring Numeric variables
		 			Integer - used to store integer variables (-2pow(n-1) to 2pow(n-1)-1)
		 				byte - 1 Byte
		 				short - 2 Bye
		 				int - 4 Byte
		 				long - 8 Byte the number should be appended with l/L
		 			Float - used to store a floating value numbers with decimal point
		 				float - 4 Bytes - Should be can be suffixed with f
		 				double - 8 Bytes - can be suffixed with d
		 		Characters - 2 Bytes -- A Variable used to store a single character, in c -- 1 Byte is used
		 								Characters used in java are unicode Characters prefixed with \\u<hexvalue of ASCII Value>
		 								Unicode Characters ranges from \\u0000 to \\uffff
		 		Boolean - 1 Byte - used to store true and false
		 	2. Abstract Datatype - User Defined Datatypes
		 	*/
		
		//byte datatype occupies 1 byte of memory which can store from -128 to 127 (2pow(2-1) to 1pow(2-1)-1)
		byte a=-128;
		byte b=0;
		byte c=127;
		byte d=(byte)129;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("c=" + d); //if the number cross the limit, it will rotate OR gives the modulo 
		
		//int datatype
		int e=100, f =20;
		System.out.println("e = : " + e + ", f = : " + f);	
		
		//Long datatype
		long i=100l;
		System.out.println("i = : " + i);	
		
		//Short int
		short j=100;
		System.out.println("j = : " + j);	
		
		//floating point
		float k=12.51f; 
		System.out.println("Result is : " + k);
		
		//floating point
		double l=100.51; //can be suffixed with d
		System.out.println("Result is : " + l);
		
		//Character Data type
		char myChar = 'A';
		System.out.println(myChar);
		
		char myChar1 = 65; //Implicit Typecasting from integer to character 
		System.out.println(myChar1);
		
		char myChar2 ='\u0041';  //Implicit Typecasting from unicode to character 
		System.out.println(myChar2);
		
		//boolean datatype, result of a condition will be stored, 2 reserved literals true or false can be stored
		boolean result=false;
		int x=100, y =20;
		result=x>y;
		System.out.println("Result is : " + result);
		
		double m=295.05;
		int n=300;
		byte o=(byte) m;
		byte p=(byte)n;
		System.out.println("o="+ o + ", p=" + p);
			
	}

}
