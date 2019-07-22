package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
	
	al.add("AAA");
	al.add("BBB");
	al.add("ccc");
	al.add("DDD");
	
	al.remove(3);
	
	System.out.println("Printing through object ");
	System.out.println(al);
	
	Iterator<String> it=al.iterator();
	System.out.println("By using iterator");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
	

}
