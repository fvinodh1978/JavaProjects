package com.collections.java;

import java.util.Iterator;
import java.util.TreeSet;

public class MySetIteration {
	public static void main(String a[]){
        
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        TreeSet<Integer> ts1=new TreeSet<Integer>();
        ts1.add(1);
        ts1.add(20);
        ts1.add(10);
        ts1.add(3);
        ts1.add(25);
        ts1.add(15);
        
        System.out.println(ts1);
    }

}
