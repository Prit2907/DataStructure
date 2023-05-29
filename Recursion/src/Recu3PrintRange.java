import java.util.Scanner;

public class Recu3PrintRange {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to select Range");
		int n=sc.nextInt();
		printNum(n);
	}
	public static void printNum(int n)
	{
		if(n!=0)
		{
			System.out.print(n+" ");
			printNum(n-1);
			System.out.print(n+" ");
		}
		else
			return;
	}
}
