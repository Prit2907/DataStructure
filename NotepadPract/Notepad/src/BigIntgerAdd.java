import java.math.BigInteger;
import java.util.Scanner;

public class BigIntgerAdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter 2 no.s : ");
		Scanner sc=new Scanner(System.in);
		String num1=sc.nextLine();
		String num2=sc.nextLine();
		sc.close();
		BigIntgerAdd bi=new BigIntgerAdd();
		bi.bigIntAdd(num1,num2);
	}
	public void bigIntAdd(String num1,String num2)
	{
		BigInteger numb1=new BigInteger(num1);
		BigInteger numb2=new BigInteger(num2);
		BigInteger sum=numb1.add(numb2);
		System.out.println(sum);
	}
}