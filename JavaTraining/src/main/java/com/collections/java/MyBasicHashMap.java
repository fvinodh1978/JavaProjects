package com.collections.java;

import java.util.HashMap;

public class MyBasicHashMap {
	 public static void main(String a[]){
		 
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
	        //add key-value pair to hashmap
	        hm.put("RAMU", 1234);
	        hm.put("VAMSI", 7894);
	        hm.put("GOPAL",4561);
	        
	        System.out.println(hm);
	        
	      //getting value for the given key from hashmap
	        System.out.println("Value of second: "+hm.get("RAMU"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        hm.remove("GOPAL");
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());
	
	 }
}
