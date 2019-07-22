package com.collections.java;

import java.util.HashMap;

public class MyHashMapKeySearch {
	public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("1234", "JOHN");
        hm.put("4561", "MOCK");
        hm.put("7894","RUDE");
        
        System.out.println(hm);
        
        if(hm.containsKey("1234"))
        {
            System.out.println("The hashmap contains key 1234");
        } 
        else 
        {
            System.out.println("The hashmap does not contains key 1234");
        }
        if(hm.containsKey("7949"))
        {
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key 7949");
        }
    }

}
