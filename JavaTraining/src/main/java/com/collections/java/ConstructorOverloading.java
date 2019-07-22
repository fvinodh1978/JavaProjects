package com.collections.java;
class ConstructorOverloading
{
	//Zero parameterized constructor
	ConstructorOverloading()
	{
	System.out.println("default constructor");
	}

	//parameterized constructor
	ConstructorOverloading(float a,int b)
	{
	double c=a+b;
	System.out.println(c);
	}

	ConstructorOverloading(int a,float b)
	{
	double c=a+b;
	System.out.println(c);
	}

	ConstructorOverloading(String s,char ch)
	{
		char ch1=s.charAt(0);//J
		if(ch==ch1)
		System.out.println("String is starts with "+ch);
		else
		System.out.println("String is notstarts with "+ch);
	}

	public static void main(String args[])
	{
		ConstructorOverloading co=new ConstructorOverloading();
													co=new ConstructorOverloading(10,1.5f);
													co=new ConstructorOverloading(2.5f, 5);
													co=new ConstructorOverloading("Java",'J');
	}		

}