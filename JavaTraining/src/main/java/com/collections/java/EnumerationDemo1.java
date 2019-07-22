package com.collections.java;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector(50);
		//Vector v = new Vector(10,2);
		for (int i=0; i<15;i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		System.out.println("Cursor Function is " + e.getClass().getName());
		while(e.hasMoreElements()){
			Integer i=(Integer) e.nextElement();
			if(i%2==0){
				System.out.println(i);
				System.out.println("Cursor Function is ");
			}
		}
		System.out.println(v);
	}
}
