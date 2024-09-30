import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String [] args) {
    
    char l;
    System.out.println("Enter a letter: ");
    Scanner input = new Scanner(System.in);
    

    l = input.next().charAt(0);

    if (Character.isLetter(l))
		{
			switch(Character.toUpperCase(l))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(l + " is a vowel"); break;
				default : System.out.println(l + " is a consonant"); 
			}
		}
		else
			System.out.println(l + " is an invalid input");
	}

   
   

    
}
