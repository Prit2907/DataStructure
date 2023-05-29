import java.util.Scanner;

public class Recu2String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.next();
		System.out.println("How many times you want to print this?");
		int n=sc.nextInt();
		printString(str,n);
	}
	public static void printString(String str,int n)
	{
		if(n==0)
			return;
		else
		{
			printString(str,n-1);
			System.out.println(n+" . "+str); 
		}
	}

}
