package com.collections.java;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("123");
		ll.add("124");
		ll.add("125");
		ll.add("126");
		System.out.println(ll);	
		ll.set(2, "Abc");
		System.out.println(ll);	
		ll.addLast("Abc");
		System.out.println(ll);	
		ll.addFirst("First");
		ll.add(1, "Second");
		System.out.println(ll);
		
	}

}
