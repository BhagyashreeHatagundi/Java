package DiscountUseingMethods;
import java.util.Scanner;
public class main {
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount Not Applicable");
		}
			
	}
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter purchaseAmount");
	double purchaseAmount=scan.nextDouble();
	checkDiscount(purchaseAmount);
}
}
