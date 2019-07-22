package com.collections.java;

import java.util.HashSet;

public class MyHashSetRetain {
	public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("apple");
        hs.add("rat");
        System.out.println(hs);
        
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        System.out.println(subSet);
        
        System.out.println(hs.containsAll(subSet));
        
        hs.retainAll(subSet);
        
        System.out.println("HashSet content:");
        System.out.println(hs);
    }

}
