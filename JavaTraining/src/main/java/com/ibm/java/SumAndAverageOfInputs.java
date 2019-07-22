package com.ibm.java;

public class SumAndAverageOfInputs {

	public static void main(String[] args) {
		if (args.length == 0){
			System.out.print("NO INPUT");
		}else {
			try {
				int numInputs=Integer.parseInt(args[0]);
				if(numInputs <=0) {
					System.out.println("FIRST ARGUMENT SHOULD BE >0\n");
				}else if(args.length != Integer.parseInt(args[0])+1){
					System.out.print("INSUFFICIENT INPUTS\n");
				}else {
					System.out.print("THE SUM IS " + Sum(args) + "\n");
					System.out.print("THE AVERAGE IS " + Average(args) + "\n");
					System.out.print("NUMERICAL INPUTS " + NumericalInputs(args) + "\n");
					System.out.print("NON NUMERICAL INPUTS " + NonNumericalInputs(args) + "\n");
				}
			}catch(Exception e) {
				System.out.println("FIRST ARGUMENT SHOULD BE INT\n");
			}
		}
	}

	private static int NonNumericalInputs(String[] args) {
		int numElements=Integer.parseInt(args[0]);
		int numericalInputs=0;
		double num;
		for (int i = 1; i<=numElements; i++) {
			try {
				num=Integer.parseInt(args[i]);
				numericalInputs=numericalInputs+1;
			}catch(Exception e){
				
			}
		}
		return numElements-numericalInputs;
	}

	private static int NumericalInputs(String[] args) {
		int numElements=Integer.parseInt(args[0]);
		int numericalInputs=0;
		double num;
		for (int i = 1; i<=numElements; i++) {
			try {
				num=Integer.parseInt(args[i]);
				numericalInputs=numericalInputs+1;
			}catch(Exception e){
				
			}
		}
		return numericalInputs;
	}

	private static double Average(String[] args) {
		// TODO Auto-generated method stub
		int numElements=Integer.parseInt(args[0]);
		double average, sum=0;
		double num;
		for (int i = 1; i<=numElements; i++) {
			try {
				num=Integer.parseInt(args[i]);
				sum=sum+num;
			}catch(Exception e){
				
			}
		}
		average=sum/NumericalInputs(args);
		return average;
	}

	private static double Sum(String[] args) {
		int numElements=Integer.parseInt(args[0]);
		double sum=0;
		double num;
		for (int i = 1; i<=numElements; i++) {
			try {
				num=Integer.parseInt(args[i]);
				sum=sum+num;
			}catch(Exception e){
				
			}
		}
		return sum;
	}
}
