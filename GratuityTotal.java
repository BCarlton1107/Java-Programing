import java.util.Scanner;

public class GratuityTotal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the subtotal: ");   // user inputs the subtotal
    double subtotal = input.nextDouble();

    System.out.println("Enter the gratuity: ");  // user inputs the gratuity 
    double gratuity = input.nextDouble();

   double rate = gratuity / 10;   // gives the amount to add the subtotal
   double total = subtotal + rate; // add the gratuity and subtotal alltogether

    
    System.out.println("The gratuity is $" + rate + " and total is $" + total);
  }    
}