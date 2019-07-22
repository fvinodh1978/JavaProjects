package com.collections.java;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("N");
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("N");
		ts.add("10");
		ts.add("10");
		//ts.add(null);
		System.out.println(ts.add("N"));
		System.out.println(ts);

	}

}
