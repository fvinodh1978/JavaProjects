package com.collections.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
 
public class MyLhsAddAllEx {
 
    public static void main(String a[]){
         
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        System.out.println(subSet);
        lhs.addAll(subSet);
        
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(lhs);
        
        //Iterating linked hash set through iterator
        System.out.println("Iterating linked hash set through iterator");
        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("delete specific element from LinkedHashSet");
        lhs.remove("second");
        
        System.out.println(lhs);
        //copy content of LinkedHashSet to an array
        String[] strArr = new String[lhs.size()];
        lhs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
        System.out.println("Does set contains 'first'? "+lhs.contains("first")); 

    }
}
