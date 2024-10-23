import java.util.Scanner;

public class SumOfTheDigits

{

   

    public static int sumDigits(long n){

       int sum = 0,digit;

        while(n != 0){

            digit = (int)n % 10;

            sum = sum + digit;

           

            n = n/10;

        }

        return sum;

    }

    public static void main(String[] args) {

	    

	    long n;

	    
	    Scanner scnr = new Scanner(System.in);

	    
 		System.out.print("Enter an integer: ");

		n = scnr.nextLong();

		
		System.out.println("Sum of the digits in the number " + n + " is: " + sumDigits(n));

	}

}