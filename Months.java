import java.util.Scanner;

public class Months {
    
    public static void main (String [] args)
{ 
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of the month: ");
int month = input.nextInt();

System.out.println("Enter the year:  ");
int year = input.nextInt();

if (month == 1)
System.out.println("January " + year + " had 31 days");
else if (month == 2)
System.out.println("Febuary " + year + " had 29 days");
else if (month == 3)
System.out.println("March " + year + " had 31 days");
else if (month == 4)
System.out.println("April " + year + " had 30 days");
else if (month == 5)
System.out.println("May " + year + " had 31 days");
else if (month == 6)
System.out.println("June " + year + " had  30 days");
else if (month == 7)
System.out.println("July " + year + " had 31 days");
else if (month == 8)
System.out.println("August " + year + " had 31 days");
else if (month == 9)
System.out.println("September " + year + " had 30 days");
else if (month == 10)
System.out.println("October " + year + " had 31 days");
else if (month == 11)
System.out.println("November " + year + " had 30 days");
else if (month == 12)
System.out.println("December " + year + " had 31 days");

}
}
