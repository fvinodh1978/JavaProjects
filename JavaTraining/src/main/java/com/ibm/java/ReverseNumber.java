package com.ibm.java;

import java.util.Scanner;

public class ReverseNumber {
        public static void main(String[] args) {
        	System.out.println("Enter a Number: ");
            Scanner sc = new Scanner(System.in);
            long num=sc.nextInt();
            long reversed = 0;
            while(num != 0) {
                long digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }
    }