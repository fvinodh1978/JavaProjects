package com.collections.java;

import java.util.Collections;
import java.util.HashSet;

public class MyBasicHashSet {
	public static void main(String a[]){
		
        HashSet<String> hs = new HashSet<String>();
        
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("first");
        hs.add("second");
     
        System.out.println(hs);
        
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        
        hs.remove("third");
        
      
        System.out.println(hs);
        
        System.out.println("Size of the HashSet: "+hs.size());
        
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
        
    }

}
