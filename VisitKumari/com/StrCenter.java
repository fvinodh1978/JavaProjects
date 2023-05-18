package VisitKumari.com;
import java.util.Scanner;
public class StrCenter{
	public char getCenter(String str){
		return str.charAt(str.length()/2);	
	}
	public static void main(String[] args){
		StrCenter mySample = new StrCenter();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=scan.nextLine();
        char character=mySample.getCenter(str);
        System.out.println("Central Character is : " + character);
        scan.close();
	}
}