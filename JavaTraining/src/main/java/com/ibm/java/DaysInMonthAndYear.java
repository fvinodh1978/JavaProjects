package com.ibm.java;
public class DaysInMonthAndYear {
	//Function
	public int getMaxDays(int month, int year) {
		int numDays = 0;
		if (year <=0)
			numDays=-2;
		else if(month==1 || month==3||month==5 || month==7||month==8 || month==10||month==12)
			numDays=31;
		else if(month==4 || month==6||month==9 || month==11)
			numDays=31;			
		else if(month ==2)
			if((year%400==0 && year%100==0) || (year%4==0 && year%100!=0))  
				numDays=29;
			else
				numDays=28;
		else
			numDays=-2;
		return numDays;
	}

	public void printMaxDays(int month, int year) {
		System.out.print(getMaxDays(month, year));
	}

	 public static boolean isleap(int year){
		return true;
	    }


	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			DaysInMonthAndYear obj = new DaysInMonthAndYear();
			obj.printMaxDays(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		

	}
}
