import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int value=0;
        int number=0;
        
        try{
            Scanner getInput = new Scanner(System.in)
            System.out.print("Enter name, age and salary:");
            number=getInput.nextInt();
            value=factorial(number);
        }catch(InputMismatchException e){
            System.out.println("Value Entered is not an Integer, Please try again with valid values");
        }
        System.out.println("Factorial :" + value);
    }
}