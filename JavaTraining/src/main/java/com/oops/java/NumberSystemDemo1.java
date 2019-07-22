package com.oops.java;

public class NumberSystemDemo1 {
	/*
	 1. Decimal Number System , allowed digits are 0 - 9 and base is 10
	 2. Octal Decimal Number System , allowed to store 0-7 and base is 8
	 	Any Number prefixed with 0 is Octal
	 3. Hexa Decimal Number System , allowed to store 0-7 and base is 16
	 	Any Number Prefixed with 0x is Hexa Decimal
	 4. Binary Number system, 0 and 1 and base is 2
	 	Binary Number will be prefixed with 0b
	 */
	public static void main(String[] args){
		int n = 10;
		System.out.println(n);
		n = 010;
		System.out.println(n);
		n = 0xA;
		System.out.println(n);
		n = 0b11;
		System.out.println(n);
		String hex = Integer.toHexString(65);
		System.out.println(hex);
		String oct = Integer.toOctalString(65);
		System.out.println(oct);
		String bin = Integer.toBinaryString(65);
		System.out.println(bin);		
	}

}
