package com.collections.java;

import java.util.LinkedHashSet;

public class MyLhsUdObjSearch {
	public static void main(String a[]){
        
        LinkedHashSet<MyPrice> lhs = new LinkedHashSet<MyPrice>();
        lhs.add(new MyPrice("Banana", 20));
        lhs.add(new MyPrice("Apple", 40));
        lhs.add(new MyPrice("Orange", 30));
        
        for(MyPrice pr:lhs){
            System.out.println(pr);
        }
        MyPrice key = new MyPrice("Banana", 30);
        
        System.out.println("Does set contains key? "+lhs.contains(key));
    }
}
 
class MyPrice{
     
    private String item;
    private int price;
     
    public MyPrice(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof MyPrice) {
        	MyPrice pp = (MyPrice) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}


