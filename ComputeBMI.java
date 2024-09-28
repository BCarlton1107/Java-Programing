import java.util.*;  // so that I can use Scanner

public class ComputeBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter person's weight:");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double WeightInKilograms = weight * KILOGRAMS_PER_POUND;
        double HeightInMeters = feet * METERS_PER_INCH;
        double BMI = WeightInKilograms / (HeightInMeters * HeightInMeters);

        System.out.println("Enter weight in pounds: " + weight);
         System.out.println("Enter feet: " + feet);
         System.out.println("Enter inches: " + inches);
         System.out.println("BMI is " + BMI);
         if (BMI  < 18.5)
         System.out.println("underweight");
         else if (BMI  < 25)
         System.out.println("normal");
         else if (BMI  < 30)
         System.out.println("overweight");
         else 
            System.out.println("obese");

    }
}