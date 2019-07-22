package com.collections.java;

import java.util.TreeSet;

import com.repo.Utilities.MyComparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(20);
		ts.add(5);
		ts.add(100);
		ts.add(20);
		System.out.println(ts);
	}
}