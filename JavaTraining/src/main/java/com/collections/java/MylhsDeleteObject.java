package com.collections.java;

import java.util.HashSet;

public class MylhsDeleteObject {
	public static void main(String a[]){
        
        HashSet<Product> lhs = new HashSet<Product>();
        
        lhs.add(new Product("Banana", 20));
        lhs.add(new Product("Apple", 40));
        lhs.add(new Product("Orange", 30));

        for(Product pr:lhs){
            System.out.println(pr);
        }
        
        Price key = new Price("Banana", 20);
        
        System.out.println("deleting key from set...");
        System.out.println(lhs.remove(key));
        System.out.println("Elements after delete:");
        for(Product pr:lhs){
            System.out.println(pr);
        }
    }
}
 
class Product{
     
    private String item;
    private int price;
     
    public Product(String itm, int pr){
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
            Product pp = (Product) obj;
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
