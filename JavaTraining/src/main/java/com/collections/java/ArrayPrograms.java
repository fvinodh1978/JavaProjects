package com.collections.java;

import java.util.*;
public class ArrayPrograms
{
public static void main(String args[])
{
	/*Single Dimentional array
//Approach1

	int a[]=new int[5];//array declaration
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;

	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]+" ");//a[0] a[1] a[2] a[3] a[4]
	}

*/





	/*Approach2
	int a[]={10,20,30,40,50};//declaration and initialization
	
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}

*/
//====================================================================
/*
int a[][]=new int[2][2];//array declaration
	a[0][0]=10;
	a[0][1]=20;
	a[1][0]=30;
	a[1][1]=40;


for(int i=0;i<a.length;i++)//--->row loop
	{
			for(int j=0;j<a.length;j++)//---->columns loop
			{
					System.out.print(a[i][j]+" ");				
			}
				System.out.println();
	}
*/

//====================================================================
	/*Double(Multi) Dimentional array
	int a[][]={{10,20,15},				//3*3
					  {30,40,35},
					  {50,60,55}
					};
	for(int i=0;i<a.length;i++)--->row
	{
			for(int j=0;j<a.length;j++)---->column
			{
					System.out.print(a[i][j]+" ");
			}
		System.out.println();
	}
	
*/

//================================================================
	//Reading Single Dimentional Array elements from keyboard
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter array size: ");
	int size=sc.nextInt();//5
	
	//array declaration
	int a[]=new int[size];

	for(int i=0;i<a.length;i++)//this is for reading values from keyboard
	{
		System.out.print("Enter "+(i+1)+" value: ");
			a[i]=sc.nextInt();
	}

	System.out.println("\n Your Entered values are: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" " );
	}

//================================================================
	/*Reading Two Dimentional Array elements from keyboard
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter row size: ");
	int row=sc.nextInt();//3

	System.out.println("Enter column size: ");
	int column=sc.nextInt();//3

	int a[][]=new int[row][column];//array declaration only
	//Now initializing with iterations


	for(int i=0;i<row;i++)//--->rows
	{
		for(int j=0;j<column;j++)
		{
				System.out.println("Enter ("+i+" ,"+j+") position value: ");
				a[i][j]=sc.nextInt();  
		}
	}
/*a[][]={{10 20 30},
				 {40 50 60},
				 {70 80 90}
				};
				
	System.out.println("The Matrix is: ");
	for(int i=0;i<row;i++)//rows for loop
	{
		for(int j=0;j<column;j++)//columns for loop
		{
		System.out.print(a[i][j]+" " );
		}
		System.out.println();
	}
*/
//================================================================
	/*Counting number of individual vootes:
	
	int count[]=new int[1000];

	int one,two,three,four,five,spoilt;
	one=two=three=four=five=spoilt=0;

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter no.  of voters in region");
	int n=sc.nextInt();//50

	for(int i=0;i<n;i++)
	{
		System.out.println("select any of this: 1   2    3    4   5  spoilt(other number))\t");
		count[i]=sc.nextInt();
	}

	for(int i=0;i<n;i++)
	{
		if(count[i]==1)
			one++;
		else if(count[i]==2)
			two++;
		else if(count[i]==3)
			three++;
		else if(count[i]==4)
			four++;
		else if(count[i]==5)
			five++;
		else
			spoilt++;
	}
	System.out.println("1st person gained votes: "+one);
	System.out.println("2nd person gained votes: "+two);
	System.out.println("3rd person gained votes: "+three);
	System.out.println("4th person gained votes: "+four);
	System.out.println("5th person gained votes: "+five);
	System.out.println("spoilt votes: "+spoilt);
	*/
//======================================================================
	/*Remove one element  from an array

	int num[]=new int[10];
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter  how many elements you need to store");
	int n=sc.nextInt();//5
	for(int i=0;i<n;i++)// 10 20 30 40 50
	{
		System.out.println("Enter "+(i+1)+" element value");
		num[i]=sc.nextInt();
	}

	System.out.println("Your enterd numbers are");
	for(int i=0;i<n;i++)
	{
			System.out.print(num[i]+" ");// 10 20 30 40 50
	}

	System.out.println("\nEnter a location to remove an element");
	int remove=sc.nextInt();//3

	for(int i=remove-1;i<n;i++) 
	{
		num[i]=num[i+1];				
	}
	System.out.println("after removing the "+remove+" location , the numbers in array are");
	for(int i=0;i<n-1;i++)
	{
			System.out.print(num[i]+" ");
	}
	*/
//======================================================================
	/* Mergin two arrays into single array
	int a[]={10,20,30,40,60};
	int b[]={15,25,35,45,55};
	
	int c[]=new int[10];

	int x=0;
	for(int i=0;i<a.length;i++)
	{
		c[x]=a[i];//10 20 30 40 60
		x++;//5
	}
	for(int i=0;i<b.length;i++)
	{
		c[x]=b[i];//10 20 30 40 60  15 25 35 45 55
		x++;
	}
	System.out.println("Before sorting an array");
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	System.out.println();

	//c[]={10 20 30 40 60 15 25 35 45 55};
	for(int j=0;j<c.length;j++)
	{
		for(int k=j+1;k<c.length;k++)
		{
			if(c[j]>c[k])
			{
				int temp=c[j];  //temp=60
				c[j]=c[k];		//c[j]=15
				c[k]=temp;		//c[k]=temp===>60
			}
		}
	}
		System.out.println("After sorting an array");
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	*/
//======================================================================
/*Sum of left and right diagonal elements
	1	2	3
	4	5	6
	7	8	9

Scanner sc=new Scanner(System.in);

int a[][]=new int[3][3];

int sumLeft=0,sumRight=0;

System.out.println("Enter array elements: ");
for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	System.out.println("The array elements are: ");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

	for(int i=0;i<3;i++)//rows
	{
		for(int j=0;j<3;j++)//columns
		{
				if(i==j)//i and j values are same
				sumLeft=sumLeft+a[i][j];  //1+5+9=15

				if(i+j==a.length-1)//her i+j = 2
				sumRight=sumRight+a[i][j];//3+5+7=15
		}
	}
	
System.out.println("Left diagonal elements are: "+sumLeft);
System.out.println("Right diagonal elements are: "+sumRight);
*/
//==================================================================
/*Lenier search
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter array size: ");
	int n=sc.nextInt();

	int k=0;
	int count=0;
	int pos=0;

	int a[]=new int[n];

	System.out.println("Enter array elements are");
	for(int i=0;i<a.length;i++)
	{
		//reading inputs into an array from keyboard
		a[i]=sc.nextInt();
	}

	System.out.println("Array elements are: ");
	for(int i=0;i<a.length;i++)
	{
		//here printing the values of an array
		System.out.print(	a[i]+" ");//10 20 30
	}

	System.out.println();

	System.out.println("Enter  an element to search");
	int f=sc.nextInt();//80

	for(k=0;k<a.length;k++)//60 70 80 90 100
	{
		if(f==a[k])//80==60,80==70,80==80
		{
			count++;//count=1
			pos=k;
		}
	}
	if(count>0)
		System.out.println("The element found at: "+(pos+1)+ "  position");
		else
	System.out.println("The element is not found ");


//=============================================================

	/*Binary Search
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  how many elements you need to store");
	int n=sc.nextInt();
	int num[]=new int[n];
	System.out.println("Enter numbers in to an array");

	for(int i=0;i<num.length;i++)
	{
		System.out.println("Enter  "+(i+1)+"element");
		num[i]=sc.nextInt();
	}

	System.out.println("Before sorting array elements are");
	for(int i=0;i<num.length;i++)
	{
			System.out.print(num[i]+" ");
	}
	System.out.println();
	for(int k=0;k<num.length;k++)
		{
		for(int p=k+1;p<num.length;p++)
			{
				if(num[k]>num[p])
				{
					int temp=num[k];  
					num[k]=num[p];
					num[p]=temp;
				}
			}
		}
	System.out.println("After sorting array elements are");
	for(int i=0;i<num.length;i++)
	{
			System.out.print(num[i]+" ");
	}
	System.out.println();

	System.out.println("Enter  an element to search");
	int f=sc.nextInt();//5
	
	int first=0,last=num.length-1,mid=(first+last)/2;
	
	for(int i=0;i<num.length;i++)// 1 2 3 4 5 6 7 8 9 10
	{ 	
			if(f<num[mid])//num[2]=3
			{
				for(int j=0;j<mid;j++)
				{
					if(f==num[j])
					{
						System.out.println("Element found at: "+(j+1));
							break;
					}
				}
			}
			else if(f>num[mid])
			{
				first=mid+1;
				for(int j=first;j<num.length;j++)
				{
					if(f==num[j])
					{
						System.out.println("Element found at: "+(j+1));
							break;
					}
				}
			}
			else if(f==num[mid])
				{
				System.out.println("Element found at: "+(mid+1));
				break;
				}
			else
				System.out.println("Element not found");
				break;
		}
	*/
//=======================================================================
	/*Selection sort
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter  how many elements you need to store");
	int n=sc.nextInt();
	
	int num[]=new int[n];

	System.out.println("Enter numbers in to an array");

	for(int i=0;i<num.length;i++)
	{
		System.out.println("Enter  "+(i+1)+" element");
		num[i]=sc.nextInt();
	}

	System.out.println("Before sorting array elements are");
	for(int i=0;i<num.length;i++)
	{
			System.out.print(num[i]+" ");
	}

	for(int i=0;i<num.length-1;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			int index = i;
			if(num[j]<num[index])
				index=j;

			int temp=num[index];
				num[index]=num[i];
				num[i]=temp;
		}
	}
	System.out.println("After sorting array elements are");
	for(int i=0;i<num.length;i++)
	{
			System.out.print(num[i]+" ");
	}
	//Bubble sort
	/*HomeWork*/

}

}  