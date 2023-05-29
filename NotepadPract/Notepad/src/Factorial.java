import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Factorial f=new Factorial();
		
		f.factorial(n);		
	}
	public void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is : "+fact);
	}
}