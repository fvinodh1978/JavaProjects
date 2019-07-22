package com.collections.java;

import java.util.HashMap;

public class MyHashMapValueSearch {
	  public static void main(String a[]){
	        HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("7894", "HANI");
	        hm.put("4561", "GIRI");
	        hm.put("4563","RAJU Sundharam");
	        
	        System.out.println(hm);
	        
	        if(hm.containsValue("RAJU"))
	        {
	            System.out.println("The hashmap contains value RAJU");
	        } else 
	        {
	            System.out.println("The hashmap does not contains value RAJU");
	        }
	        if(hm.containsValue("HANI"))
	        {
	            System.out.println("The hashmap contains value HANI");
	        } else 
	        {
	            System.out.println("The hashmap does not contains value HANI");
	        }
	    }
	
}
