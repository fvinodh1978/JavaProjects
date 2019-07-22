package com.collections.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLkdHashSetOperations {
	public static void main(String a[]){
        
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        
        System.out.println(lhs);
        
        Iterator itr=lhs.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        System.out.println("LinkedHashSet size: "+lhs.size());
        System.out.println("Is LinkedHashSet emplty? : "+lhs.isEmpty());

        //clear the elements from linked hash set
        lhs.clear();
        System.out.println(lhs);
    }

}
