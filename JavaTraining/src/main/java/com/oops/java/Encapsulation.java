package com.oops.java;

class Car{
	private String Model;
	private String Make;
	private String Type;
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		this.Model = model;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		this.Make = make;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	
	public void showCarDetails() {
		System.out.println("=================================================");
		System.out.println("|Model             |Make           |Type        |");
		System.out.println("|" + Model + "     |" + Make + "   |" + Type + "|");
		System.out.println("=================================================");
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Car zen = new Car();
		zen.setMake("Maruthi");
		zen.setType("Sedan");
		zen.setModel("2019");
		String model = zen.getModel();
		zen.showCarDetails();
	}
}
