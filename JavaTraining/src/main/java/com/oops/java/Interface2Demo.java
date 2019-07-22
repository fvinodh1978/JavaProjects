package com.oops.java;

	abstract public interface Interface2Demo extends Interface1Demo{
		int cons=100;
		// All the methods in an interface are abstract
		//Supports multiple inheretance ie Class can be implemented from multiple interface
		//Complier will make the interfaces member data as public static final so it can be accesses thru class itself
		//Complier makes interface methods as public and abstract
		//Since Compiler makes the interface methods as public, while implementation it should be public
		
		abstract int add(int x, int y);
		abstract int subtract(int a, int b);
	}
