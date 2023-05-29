import java.util.Scanner;

public class Recu6AddArray {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array element at "+i);
			arr[i]=sc.nextInt();
		}
		int sum=addArray(arr,arr.length);
		System.out.println(sum);
	}
	public static int addArray(int arr[],int l)
	{
		if(l==0)
			return 0;
		else
		{
			int sum=addArray(arr,l-1)+arr[l-1];
			return sum;
		}
	}

}
