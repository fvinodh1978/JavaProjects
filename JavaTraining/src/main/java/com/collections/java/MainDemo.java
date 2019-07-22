package com.collections.java;
class InheritanceDemo
{
	int b=12;
	
}

class A extends B
{
	int c=60;
}

class B extends InheritanceDemo
{
	
}

class C extends A
{

}

class D extends InheritanceDemo
{
	
}

public class MainDemo extends D
{
public static void main(String args[])
{
	MainDemo md=new MainDemo();
	System.out.println(md.b);

		C c1=new C();
	System.out.println(c1.c);

	B b1=new B();
System.out.println(b1.b);
}
}