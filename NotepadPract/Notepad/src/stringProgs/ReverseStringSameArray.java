package stringProgs;

public class ReverseStringSameArray {

	public static void main(String[] args) 
	{
		reverseString("pritamm");

	}
	public static void reverseString(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=(arr.length)-(i+1);;)
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				break;
			}
			
		}
		System.out.println(arr);
				
	}

}
