package com.ibm.java;
import java.util.Arrays;


public class SumOfEvensAndOdds {
	
	//Function 
	public int[] getSumOfEvensAndOdds(int[] input) {
		int sumE=0, sumO=0;
	    int[] outut = new int[2];
        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                sumE = sumE + input[i];
            }else{
                sumO = sumO + input[i];
            }
        }
        outut[0]=sumE;
        outut[1]=sumO;     
        return outut;
	}

	public void printSumOfEvensAndOdds(int[] input) {
		System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
	}

	public static void main(String[] args) {

		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
			obj.printSumOfEvensAndOdds(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}

	}
}
