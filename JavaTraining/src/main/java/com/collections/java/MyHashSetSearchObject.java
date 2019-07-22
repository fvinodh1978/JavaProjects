package com.collections.java;

import java.util.HashSet;

public class MyHashSetSearchObject {
	public static void main(String a[]){
        
        HashSet<PriceItem> lhs = new HashSet<PriceItem>();
        lhs.add(new PriceItem("Banana", 20));
        lhs.add(new PriceItem("Apple", 40));
        lhs.add(new PriceItem("Orange", 30));
        
        for(PriceItem pr:lhs){
            System.out.println(pr);
        }
        
        PriceItem key = new PriceItem("Banana", 20);
        
        System.out.println("Does set contains key? "+lhs.contains(key));
    }
}
 
class PriceItem{
     
    private String itemPrice;
    private int priceItem;
     
    public PriceItem(String itm, int pr){
        this.itemPrice = itm;
        this.priceItem = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = priceItem*20;
        hashcode += itemPrice.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof PriceItem) {
            PriceItem pp = (PriceItem) obj;
            return (pp.itemPrice.equals(this.itemPrice) && pp.priceItem == this.priceItem);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return itemPrice;
    }
    public void setItem(String itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getPrice() {
        return priceItem;
    }
    public void setPrice(int priceItem) {
        this.priceItem = priceItem;
    }
     
    public String toString(){
        return "itemPrice: "+itemPrice+"  priceItem: "+priceItem;
    }

}
