import java.util.Scanner;
public class SortedNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Numbers in ascending order: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Numbers in ascending order: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Numbers in ascending order: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Numbers in ascending order: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Numbers in ascending order: " + num3 + " " + num2 + " " + num1);
            }
        }
    }
}
