package com.collections.java;

import java.util.HashMap;

public class MyHashMapCopy {
	public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "AAA");
        hm.put("second", "BBB");
        hm.put("third","CCC");
        
        System.out.println("First hashmap<KEY, VALUE>:   "+hm);
        
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "Hello");
        subMap.put("s2", "Bye");
        
        System.out.println("Second hashmap<KEY, VALUE>:   "+subMap);
        
        hm.putAll(subMap);
        System.out.println("After putAll() method: "+hm);
    }

}
