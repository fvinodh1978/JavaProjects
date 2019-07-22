package com.collections.java;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("3");
		al.add(null);
		System.out.println(al );
		ArrayList<String> al1 = new ArrayList<String>(al);
		ListIterator<String> itr = al1.listIterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		while (itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		al1.remove(2);
		al1.add(2, "ABC");
		al1.add(2, "cda");
		
		ListIterator<String> itr1 = al1.listIterator();
		while (itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		Vector v = new Vector();
		v.add("123");
		v.add("124");
		v.add("125");
		
		ListIterator itr2 = v.listIterator();
		while (itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
	}
}
