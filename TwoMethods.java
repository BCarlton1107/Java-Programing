import java.util.Scanner;
public class TwoMethods{
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static double average(double[] array){
        double sum = 0;
        for(int i = 0;i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

      double arr[] = new double[10];
        System.out.println("Enter 10 double values: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = scnr.nextDouble();
        }

        System.out.printf("The average double value is: %.2f",average(arr));
    }
}
