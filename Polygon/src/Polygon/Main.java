package Polygon;
import java.util.Scanner;
public class Main {
	public static void identifyPolygon(int sides)
	{
		if(sides==3)
		{
			System.out.println("triangle");
		}
		else if(sides==4)
		
		{
			System.out.println(" quadrilateral");
		
		}
		else if(sides==5)
		{
			System.out.println("pentagon");
		}
		else if(sides==6)
		{
			System.out.println("Hexagon");
		}
		else
		{
			System.out.println("Polygon");
		}
		}
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter sides");
	int sides=scan.nextInt();
	identifyPolygon(sides);
}
}
