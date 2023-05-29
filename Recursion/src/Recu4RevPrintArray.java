import java.util.Scanner;

public class Recu4RevPrintArray {

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
		arrayRev(arr,arr.length);
	}
	public static void arrayRev(int[] arr,int l)
	{
		if(l==0)
			return;
		else
		{
			System.out.print(" "+arr[l-1]);
			arrayRev(arr,l-1);
		}
	}

}
