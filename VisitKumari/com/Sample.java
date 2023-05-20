package VisitKumari.com;
public class Sample{	
	public static void main(String[] args){
		//Calling public Method
		MyLibrary myObj1 = new MyLibrary(44, "Vinodh");
		MyLibrary myObj2 = new MyLibrary("Vinodh", 44);
		MyLibrary myObj3 = new MyLibrary();
		System.out.println(myObj1.age);
		System.out.println(myObj1.name);
		System.out.println(myObj2.age);
		System.out.println(myObj2.name);
		myObj3.fullThrottle();
		myObj3.speed(80);		
	}
}