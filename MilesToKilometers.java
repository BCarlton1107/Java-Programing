public class MilesToKilometers{
    
public static void main(String args[]){
    System.out.println("Miles\tKilometers");
    for(double miles = 1; miles <= 10; miles++){
    System.out.printf("%.0f\t%.3f\n", miles, 1.609 * miles);
    }
    }
    }