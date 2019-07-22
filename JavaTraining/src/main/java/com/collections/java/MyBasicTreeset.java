package com.collections.java;

import java.util.TreeSet;

public class MyBasicTreeset {
	public static void main(String a[]){
        
        TreeSet<String> ts = new TreeSet<String>();
        
        ts.add("one");
        ts.add("two");
        ts.add("three");
        
        System.out.println("Elements: "+ts);
        
        //check is set empty?
        System.out.println("Is set empty: "+ts.isEmpty());
        
        //delete all elements from set
        ts.clear();
        
        System.out.println("Is set empty: "+ts.isEmpty());
        
        ts.add("one");
        ts.add("two");
        ts.add("three");
        
        System.out.println("Size of the set: "+ts.size());
        
        //remove one string
        ts.remove("two");
        
        System.out.println("Elements: "+ts);
        
        TreeSet<Integer> its=new TreeSet<Integer>();
        its.add(300);
        its.add(100);
        its.add(200);
        System.out.println(its);
    }

}
