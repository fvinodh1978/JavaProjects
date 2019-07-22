package com.collections.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyDistElementEx1 {
	public static void main(String a[]){
        
        LinkedHashSet<Price> lhm = new LinkedHashSet<Price>();
        lhm.add(new Price("Banana", 20));
        lhm.add(new Price("Apple", 40));
        lhm.add(new Price("Orange", 30));
       
        for(Price pr:lhm){
            System.out.println(pr);
        }
        Iterator<Price> itr=lhm.iterator();
        while (itr.hasNext()) {
			Price price = (Price) itr.next();
			System.out.println(price.getItem());
			System.out.println(price.getPrice());
			
		}
        
        Price duplicate = new Price("Banana", 20);
        
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
    }
}
 
class Price1{
     
    private String item;
    private int price;
     
    public Price1(String itm, int pr){
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
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.getItem().equals(this.item) && pp.getPrice() == this.price);
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


