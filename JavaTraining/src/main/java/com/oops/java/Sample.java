package com.oops.java;

public class Sample {
	int c= 10;
	void inc(){
		c=c+1;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		s1.inc(); s2.inc(); s3.inc();
		System.out.println(s1.c + " " +  s2.c + " " +  s3.c);
		
	}

}
