import java.util.Scanner;

public class Recu8RevArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array element at "+i);
			arr[i]=sc.nextInt();
		}
		
		revArray(arr,0,arr.length-1);
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		} 
	}
	public static int[] revArray(int arr[],int i,int j)
	{
		if(i>j)
			return arr;
		else
		{
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			return revArray(arr,i+1,j-1);
		}
	}

}
