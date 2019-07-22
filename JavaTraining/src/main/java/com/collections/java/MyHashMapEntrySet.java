package com.collections.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMapEntrySet {
	public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        
        //add key-value pair to hashmap
        hm.put("first", "Ramu");
        hm.put("second", "John");
        hm.put("third","Smith");
        
        System.out.println(hm);
        
        //getting value for the given key from hashmap
        Set<Entry<String, String>> entires = hm.entrySet();
        
        for(Entry<String,String> ent:entires)
        {
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }

}
