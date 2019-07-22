package com.oops.java;

//Throwable is the superclass of all the exceptions and Errors
//Exception there are two types Checked and Unchecked
//Checked Exception will be caught at Compile time
//UnChecked Exception will be caught at runtime
//All those exceptions which are direct child of Exception are checked exception and will be caught at compilation time
//All those exceptions which are direct child of RuntimeException are Unchecked exception and will be caught at runtime
//Error happens because of 	Environment VirtualMachineError is a child of Error
//Inbuilt Exception Handling : 
//Child Class Object can be stored in a Superclass variable/Reference -- all the child exceptions can be caught in Superclass "Exception"
//When ever object is given in the print statement, 
//if an Exception is occurring in a method, then Caller is also responsible for that exception
//try block inside another try block is called nested try block
//if exception occurs in the statement in the outer try, outer catch will catch
//if exception occurs in the statement in the inner try, it will consider the inner catch block, if inner wont catch then outer catch will be considered
//If Main is calling a method say calculate and if Calculate is throwing an exception and if calculate is not cating it will be fireed to main, 
//and if main wont catch , the exception is fired to caller of main class (ie JVM)
public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[0]);
		}catch(ArithmeticException e){
			System.out.println("Exception : Cannot divide a number by Zero");
			System.out.println("Message :" + e.getMessage());
			System.out.println("Message :" + e); //Calls toString of Exception
		}catch(NumberFormatException e){
			System.out.println("Exception : Cannot divide a number by Zero");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception : Cannot divide a number by Zero");
		}finally{
			System.out.println("Exception : Cannot divide a number by Zero");
		}
	}
}