package com.oops.java;
//Throw is an object used to throw an exception explicitly
//Throw is mainly used to throw user defined Exceptions
//
public class ExceptionThrow {
	public static void main(String [] args) throws Exception{
		System.out.println();
		try{
			int b=10;
			if(b==0){
				throw new Exception("Divide by Zero may Happen" );
			}
			
		}finally{
			
		}

	}
}