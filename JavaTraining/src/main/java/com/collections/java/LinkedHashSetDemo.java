package com.collections.java;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
		public static void main(String[] args) {
			LinkedHashSet hs=new LinkedHashSet();
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
