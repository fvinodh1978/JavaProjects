package com.oops.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> bank=new HashMap<String, Double>();
		bank.put("Vinodh", 125.00);
		System.out.println(bank);
		//to retrieve the keys
		Set<String> keys=bank.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+", ");
		}
		//to retrieve the 
		
	}

}
