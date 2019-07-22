package com.collections.java;
import java.util.*;
public class ListIteratorDemo {

	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println(al);
		// Use iterator to display contents of al
		System.out.print("Original contents of al: ");
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
		}
		System.out.println(itr.getClass().getName());
	}
}
