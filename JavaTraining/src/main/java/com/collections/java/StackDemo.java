package com.collections.java;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("Level1");
		s.add("Level2");
		s.push("Level3");
		s.add("Level4");					
		s.add("Level5");
		s.add("Level6");
		s.add("Level7");
		s.add("Level8");
		System.out.println(s);
		System.out.println(s.search("Level1"));
		s.pop();
		System.out.println(s);
		System.out.println(s.search("Level1"));
		System.out.println(s.peek());
	}
}
