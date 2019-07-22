package com.oops.java;

public class ArrayDemo {

	public static void main(String[] args) {
		/*Array Variable Declaration and Initialization
		Array constants can only be used in initializers -- below code is not correct
		int[] myArray ;
		myArray=new int[6];
		myArray={1, 2, 3, 4, 5, 6};
		*/
		int[] myArray ={1, 2, 3, 4, 5, 6};
		System.out.print("Number of Elements in myArray = " + myArray.length);
		for (int i=0; i<myArray.length; i++){
			System.out.print("\nElement " + (i+1) + " is " + myArray[i]);
		}
		
		/*	Creating a Array, by declaring an Array as below will initialize with default value
			byte, short, int, long --0
			float, double -- 0.0
			char - \u0000(space)
			boolean-false
			String(any Object) - null
		 */
		int[] myArray2 = new int[5];
		myArray2[0]=1;
		myArray2[1]=2;
		myArray2[2]=3;
		myArray2[3]=4;
		myArray2[4]=5;
		System.out.print("Number of Elements in myArray = " + myArray.length);
		int k=0;
		for (int x : myArray2){
			System.out.print("\nElement " + k + " is " + x);
			k++;
		}
		System.out.print("\n");
		int[] intArray = new int[5];
		for (int a : intArray){
			System.out.print(a + " \t");
			k++;
		}
		System.out.print("\n");
		String[] strArray = new String[5];
		for (String b : strArray){
			System.out.print(b + " \t");
			k++;
		}
		System.out.print("\n");
		boolean[] boolArray = new boolean[2];
		for (boolean c : boolArray){
			System.out.print(c + " \t");
			k++;
		}
		
		//Multidimensional Array Creation
		//Array containing other array is Multidimensional array
		
		int[][] my2dimArray = new int[4][5];
		System.out.println("\nSize of array my2dimArray is : " + my2dimArray.length);
		for (int i=0; i< my2dimArray.length; i++){
			System.out.println("Size of array my2dimArray["+i+"] is : " + my2dimArray[i].length);
		}
		
		//Multidimensional Array Initialization
		int[][] my2dimArray1 = {{1,2},{2,3},{4,5,6},{5,7,8,9},{6, 10, 10, 10}};
		System.out.println("\nSize of array my2dimArray is : " + my2dimArray1.length);
		for (int i=0; i< my2dimArray1.length; i++){
			System.out.println("Size of array my2dimArray1["+i+"] is : " + my2dimArray1[i].length);
		}
		
		for (int i=0; i< my2dimArray1.length; i++){
			System.out.print("\nContent of my2dimArray1["+i+"] are : ");
			for (int ele : my2dimArray1[i] ){
				System.out.print(ele + ", \t");
			}
		}	
	}
}
	
