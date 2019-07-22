package com.collections.java;
//Reading Keyboard input
import java.util.Scanner;
import java.io.*;
class ReadingInputDemo{
	public static void main(String[] args) throws Exception{
		if (args.length==0){
			System.out.println("Usage is ReadingInputDemo <Command> [<arguments>]");
			return;
		}
		String Command=args[0];
		switch(Command){
			case "countArgument" :
				countArguments(args);
				break; //optional
			case "EvenOrOdd" :
				if (args.length < 2){
					System.out.println("Usage is ReadingInputDemo <EvenOrOdd> <Odd/Even>");
					return;
				}
//				calculateEvenOrOdd("Odd");
				calculateEvenOrOdd(args[1]);
				break; //optional
			case "Prime" :
				if (args.length > 1){
					System.out.println("Usage is ReadingInputDemo <Prime>");
					return;
				}
				calculatePrime();
				break; //optional
			default : //Optional
				System.out.println("Command is Invalid " + Command);
		}		
	}
	public static void countArguments(String[] inputArguments) {
		//Function to Explain Command Line Arguments
		System.out.print("Number of Arguments : " + inputArguments.length);
    }
	public static void calculateEvenOrOdd(String inputCommand) {
		System.out.print("Enter the Number: ");
		Scanner readKey = new Scanner(System.in);
		String inputStr = readKey.nextLine();
		String[] inputNumbers = inputStr.split(",");
		System.out.print("Command is : " + inputCommand );
		if (inputCommand=="123"){
			System.out.print("Odd Numbers are : ");
			for (int i=1; i< inputNumbers.length; i++){
				if ( Integer.parseInt(inputNumbers[i]) % 2 != 0){
					System.out.print(inputNumbers[i] + ",");
				}
			}
		}else{
				System.out.print("Even Numbers are : ");
				for (int i=1; i< inputNumbers.length; i++){
				if ( Integer.parseInt(inputNumbers[i]) % 2 == 0){
					System.out.print(inputNumbers[i] + ",");
				}
			}
	  }
    }
	public static void calculatePrime() throws Exception {
		//Function to Explain BufferedReader Functionality
		System.out.print("Enter the Number: ");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String inputStr = br.readLine();
		int inputNum = Integer.parseInt(inputStr);
		String prime="Yes";
		for(int i=2; i<=inputNum/2; i++){
			if(inputNum % i == 0){
                prime="No";
            }
		}
		if (prime=="Yes"){
			System.out.println("Entered Number : " + inputNum + " is a Prime Number");
		}
		else{
			System.out.println("Entered Number : " + inputNum + " is Not a Prime Number");
		}
	}
}
