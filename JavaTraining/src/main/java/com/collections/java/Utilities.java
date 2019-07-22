package com.collections.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Utilities {
	protected final static int LUCKY_NUMBER=100;
	protected static int num1, num2=100;
	public static int objectCount=0;
	protected static int id=0;
	public String test="Success";
	
	public Utilities() throws Exception{
		id=objectCount;
		if (objectCount>2){
			 try {
			 	throw new Exception();
			 }catch(Exception e){
				 System.out.println("Number of Objects exceeded the Limit of " + LUCKY_NUMBER );
				 test="Failure";
				 return;
			 }
		}
		objectCount++;
	}
	public static void add2num(int x, int y){
		int sum=x+y;
		System.out.println("Sum of " + x + " and " + y + " is : " + sum);
		//System.out.println("num1 = " + num1 + "and num2 = " + num2);
		
	}
	
	@SuppressWarnings("unused")
	private static void StrTokenizer() throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		File file=new File("C:\\Personal\\Vinodh\\Training\\Hadoop\\Datasets\\MapReduce\\Temperature.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int year, temp;
			int counter=0;
			int max_temp=0;
			int max_year=0;
			while ((line=br.readLine()) != null){
				counter++;
				StringTokenizer tokenizer= new StringTokenizer(line);
				while(tokenizer.hasMoreTokens()){
					year=Integer.parseInt(tokenizer.nextToken());
					temp=Integer.parseInt(tokenizer.nextToken());
					System.out.println("Record # " + counter + " Year is : " + year + " Temperature is :" + temp);
					max_temp=Math.max(max_temp, temp);
					max_year=temp >= max_temp ? year: max_year;
				}
			}
			System.out.println("Max Temperature is :" + max_temp + " and Year is :" + max_year);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
