package GCD;

import java.util.Scanner;

public class GCDApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int res=GDC.GCD(m,n);
		System.out.println("GCD of"+m+"and"+n+"is "+res);
	}

}
