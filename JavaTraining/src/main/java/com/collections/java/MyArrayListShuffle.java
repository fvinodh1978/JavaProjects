package com.collections.java;
import java.util.ArrayList;
import java.util.Collections;
 
public class MyArrayListShuffle {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
         
       
        System.out.println("Results before shuffle operation:");
        for(String str: list){
            System.out.print(str+",");
        }
        System.out.println();
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.print(str+",");
        }
    }
}
