import java.util.Scanner;

public class Recu7Fact {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println(fact);
	}
	public static int factorial(int n)
	{
		if(n==0)
		return 1;
		else
		{
			return factorial(n-1)*n;
		}
	}

}
