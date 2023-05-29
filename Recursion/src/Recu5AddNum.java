import java.util.Scanner;

public class Recu5AddNum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number you want add");
		int n=sc.nextInt();
		int sum=add(n);
		System.out.println(sum);
	}
	public static int add(int n)
	{
		if(n==0)
			return 0;
		else
		{
			int sum=add(n-1)+n;
			return sum;
		}
	}

}
