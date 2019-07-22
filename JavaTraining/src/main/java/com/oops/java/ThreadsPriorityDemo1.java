package com.oops.java;

public class ThreadsPriorityDemo1
{
public static void main(String[] args) throws Exception
{
Counter obj1=new Counter();
Counter obj2=new Counter();
obj1.setPriority(2);
obj2.setPriority(9);
obj1.start();
obj2.start();
Thread.sleep(10000);
obj1.stop();
obj2.stop();
System.out.println("\n\n");
System.out.println(obj1.n+"\n"+obj2.n);
}
}

