package com.ibm.java;
//With in an interface all methods should be Public
//Interfaces allow only concrete methods
//Classes can inherit multiple interfaces
//Interface can inherit multiple Interfaces
//interface can inherit abstract class


interface First {
    public void testMethod();
    
    /*
     * public int calc() { return 0; }
     */
}

interface Second {
     void testSecondMethod();
}

interface Third extends First, Second{
    public void testThirdMethod();
}

public class InterfaceDemo implements Third {
    public void testMethod() {
        System.out.println("First Interface");
    }
    
    public void testSecondMethod() {
        System.out.println("Second Interface");
    }
    
    public void testThirdMethod() {
        System.out.println("Third Interface");
    }
    
    public static void main(String[] args) {
    	InterfaceDemo obj = new InterfaceDemo();
        obj.testMethod();
        obj.testSecondMethod();
        obj.testThirdMethod();
    }
}
