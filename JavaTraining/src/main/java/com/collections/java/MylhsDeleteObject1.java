package com.collections.java;

import java.util.LinkedHashSet;

public class MylhsDeleteObject1 {
	public static void main(String a[]){
        
        LinkedHashSet<MyItemPrice> lhs = new LinkedHashSet<MyItemPrice>();
        lhs.add(new MyItemPrice("Banana", 20));
        lhs.add(new MyItemPrice("Apple", 40));
        lhs.add(new MyItemPrice("Orange", 30));
        for(MyItemPrice pr:lhs){
            System.out.println(pr);
        }
        MyItemPrice key = new MyItemPrice("Banana", 20);
        System.out.println("deleting key from set...");
        lhs.remove(key);
        System.out.println("Elements after delete:");
        for(MyItemPrice pr:lhs){
            System.out.println(pr);
        }
    }
}
 
class MyItemPrice{
     
    private String item;
    private int price;
     
    public MyItemPrice(String itm, int pr){
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
        	MyItemPrice pp = (MyItemPrice) obj;
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
