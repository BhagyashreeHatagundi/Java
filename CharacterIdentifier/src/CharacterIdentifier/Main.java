package CharacterIdentifier;
import java.util.Scanner;
public class Main {
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Entered character "+ch+" is a digit");
		}
		else if(Character.isLowerCase(ch))
		{	
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.println("Entered character "+ch+" is a lower-case vowel");
			else
				System.out.println("Entered character "+ch+" is a lower-case consonant");
		}
		else if(Character.isUpperCase(ch))
		{
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				System.out.println("Entered character "+ch+" is a upper-case vowel");
			else
				System.out.println("Entered character "+ch+" is a upper-case consonant");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the character :");

		char c = scan.next().charAt(0);

		identifyCharacter(c);
	}
}


   


