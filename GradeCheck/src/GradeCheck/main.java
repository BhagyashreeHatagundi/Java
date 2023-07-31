package GradeCheck;
import java.util.Scanner;
public class main {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" Entre Grade");
		int grade=scan.nextInt();
		checkGrade(grade);
	}
	
	public static void checkGrade(int grade)
	{

	if(grade>50)

	{
	System.out.println("PASS");
	}
	else
	{
	System.out.println("FAIL");
	}

	}

}
