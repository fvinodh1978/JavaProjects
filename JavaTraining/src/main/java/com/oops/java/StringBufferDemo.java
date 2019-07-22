package com.oops.java;

public class StringBufferDemo {

	public static void main(String[] args) {
		//String Buffer is Mutable, means updates happens in the same memory
		//if String need not be changed, use String
		//if String needs to be changed, use String Buffer
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length() + "\t" + sb.capacity());
	}
}
