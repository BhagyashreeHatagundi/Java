package MultipleOfTenChecker;
import java.util.Scanner;
public class main {
	public static void checkMultipleOfTen(int n,int m)
	{
		if(n%m==0)
		{
			System.out.println("Entered Number" +n+" Is multiple of "+m);
		}
		else
		{
			System.out.println("Entered Number" +n+"Is not multiple ");
		}
	}
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int n=scan.nextInt();
	int m=scan.nextInt();
	checkMultipleOfTen(n,m);
	
}
}
