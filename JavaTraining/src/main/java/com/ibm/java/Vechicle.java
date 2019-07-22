package com.ibm.java;

class Vechicle {
    int modelno;
    String modelname;
    String color;
    
    Vechicle(int modelno,String modelname,String color) {
        this.modelno = modelno;
        this.modelname = modelname;
        this.color = color;
    }
    
    void displayDetails() {
        System.out.println("Model No: " + modelno);
        System.out.println("Name: " + modelname);
        System.out.println("Color: " + color);
    }
    
    void dislayAutoDetails() {
    	System.out.println("This is Parent/Super Class: Explaining Overriding...");
    }     
}