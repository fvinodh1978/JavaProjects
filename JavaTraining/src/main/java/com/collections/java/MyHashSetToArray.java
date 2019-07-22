package com.collections.java;

import java.util.HashSet;

public class MyHashSetToArray {
	public static void main(String a[]){
        
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        
        System.out.println("HashSet content: ");
        System.out.println(hs);
        
        String[] arr = new String[hs.size()];
        
        hs.toArray(arr);
        System.out.println("Copied array content:");
        
        for(String str:arr){
            System.out.println(str);
        }
        
        
    }

}
