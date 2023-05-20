package VisitKumari.com;

public class MyLibrary {
	String name;
	int age;
	public MyLibrary(String nameValue, int ageValue){
		name=nameValue;
		age=ageValue;
		System.out.println("In Parameterised Constructor name/age.");
	}
	
	public MyLibrary(int ageValue, String nameValue){
		name=nameValue;
		age=ageValue;
		System.out.println("In Parameterised Constructor age/name");
	}
	
	public MyLibrary(){
		name="Kingsten";
		age=43;
		System.out.println("In 0 argument Constructor");
	}
	//Static Methods are only accessible directly, they cant be accessed via Object
	public void fullThrottle(){
		System.out.println("Car is going in full Speed");
	}
	
	//Public Methods are only accessible via Object
	public void speed(int speed){
		System.out.println("Car Speed is : " + speed);
	}
}
