import java.util.Scanner;  //input java.util Package

public class CelsiusToFahrenheit {
   public static void main(String[] args)  {
     Scanner input = new Scanner(System.in);  //create the scanner object for input from the console
     
     System.out.println("Enter a degree in Celsius: ");
     double Celsius = input.nextDouble();     // Defined Celsius to input from the console
     
     double Fahrenheit = (9.0 / 5 * Celsius) + 32;   // Convert from Celsius to Fahrenheit
     System.out.println(Celsius  + " degrees Celsius is " + Fahrenheit + " degrees Fahrenheit");
   }
}