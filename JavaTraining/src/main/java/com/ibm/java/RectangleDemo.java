package com.ibm.java;

import java.util.*;

class Rectangle {
	private String color;
	private double width;
	private double height;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea(){
		return this.width*this.height;
	}
	
	public double getPerimeter(){
		return 2*(this.width+this.height);
	}
}

public class RectangleDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String color=sc.nextLine();
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		Rectangle rectangle = new Rectangle();
		rectangle.setColor(color);
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		System.out.println("Area of the Rectangle is : " + rectangle.getArea());
		System.out.println("Perimeter of the Rectangle is : " + rectangle.getPerimeter());		
	}
}
