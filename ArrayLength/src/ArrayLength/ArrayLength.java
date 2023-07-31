package ArrayLength;
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array  length ");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+"elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are....");
	
	for(int X:arr)
	{
		System.out.print((X+5)+" ");
	}

}
}
