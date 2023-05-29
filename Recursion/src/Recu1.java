
public class Recu1 {

	public static void main(String[] args) 
	{
		int n=6;
		Recu1 r=new Recu1();
		r.printNum(n);
	}
	public void printNum(int n)
	{
		if(n==0)
			return;
		else 
		{
			System.out.print(" "+n+" ");
			printNum(n-1);
			System.out.print(" "+n+" ");
		}
	}
}
