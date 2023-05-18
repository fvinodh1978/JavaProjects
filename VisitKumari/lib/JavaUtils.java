package VisitKumari.lib;
public class JavaUtils{
	public int getRand(int start, int stop){
        return (int)(Math.random()*(stop-start+1)+start); 
	}
	public char getMidPoint(String str) {

        return str.charAt(str.length()/2);
    }
	
    public int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}