package AgeCategorizer;
import java.util.Scanner;
public class Main {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=scan.nextInt();
		categorizerAge(age);
		
	}
	public static void categorizerAge(int age)
	{
		if(age>=0 && age<=12)
		{
			System.out.println("CHILD");
		}
		else if(age<=13 && age<=19)
		{
			System.out.println("TEEN");
			}
		else if(age<=20 && age<=59)
		{
			System.out.println(" ADULT");
		}
		else
		{
			System.out.println("SEINOR");
		}
		}
	
}