package com.collections.java;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//Vector v = new Vector();
		Vector v = new Vector(50);
		//Vector v = new Vector(10,2);
		for (int i=0; i<15;i++){
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.addElement("A");
	}
}
