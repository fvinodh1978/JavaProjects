package com.collections.java;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("N");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("N");
		hs.add(null);
		hs.add(10);
		hs.add(10.1);
		System.out.println(hs.add("N"));
		System.out.println(hs);
	}
}
