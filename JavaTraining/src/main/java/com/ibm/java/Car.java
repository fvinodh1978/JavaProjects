package com.ibm.java;

/////////////////Inheritance Notes///////////////
//Inheritance:
//Inheriting the properties from the super class to sub class
//Child class inheriting from the parent class 
//Type : 
//Single inheritance
//Multiple inheritance - not supported by java
//Multi level inheritance
//Hybrid - not supported by java 
//A final class cannot be extended
//If a Method is Final, it cant be overrided

public class Car extends Vechicle {
    boolean acType;
    
    Car(boolean acType,int modelno,String modelname,String color) {
        super(modelno,modelname,color);
        this.acType = acType;
    }
    
    void dislayCarDetails() {
        if(acType) 
            System.out.println("AC");
        else
            System.out.println("Non AC");
    }
    
    public static void main(String[] args) {
        Car obj = new Car(true,100,"maruti car","blue");
        obj.displayDetails();
        obj.dislayCarDetails();
        obj.dislayAutoDetails();
    }
    
    void dislayAutoDetails() {
        super.dislayAutoDetails(); 
    	System.out.println("This is Child/Super Class: Explaining Overriding...");
    }    

}

