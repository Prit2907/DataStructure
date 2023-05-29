package logical;

import java.util.Scanner;

public class LogicalProgs 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LogicalProgs p=new LogicalProgs();
//		p.countNoOfDigits(112);
//		p.reverseNumber(12332);
//		p.armstrongNum(54748);
//		p.isPalindrome(1223221);
//		p.findHCF(137,274);
//		p.divisorOrFactor(15);
//		p.lcm(20,30);
//		p.primeOrNot(6);
		System.out.println("Enter Range to get prime Numbers between them\nEnter first number\n");
		int snum=sc.nextInt();
		System.out.println("\nEnter Second number");
		int endnum=sc.nextInt();
		p.primeNumRange(snum,endnum);	
	}
	public void countNoOfDigits(long n)
	{
		int count = 0;
		for(;n!=0;)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of Digits = "+count);
	}
	public void reverseNumber(int n)
	{
		int rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	/*
	 * Arms)trong number is the number where addition of every digit raised to total
	 * number of digits exactly equal to number itself.....! EX.for 3 digit digits'
	 * cubes' addition is that number itself
	 * 153=(1)³+(5)³+(3)³=153
	 */
	public void armstrongNum(int n)
	{
		int n1=n,n2=n,rem=0,num=0,count=0;
		while(n2!=0)
		{
			n2=n2/10;
			count++;
		}
		while(n!=0)
		{
			if(count==3)
			{
				rem=n%10;
				num=num+(rem*rem*rem);
				n=n/10;
			}
			else if(count==4)
			{
				rem=n%10;
				num=num+(rem*rem*rem*rem);
				n=n/10;
			}
			else if(count==5)
			{
				rem=n%10;
				num=num+(rem*rem*rem*rem*rem);
				n=n/10;
			}
		}
		if(n1==num)
		{
			System.out.println("Yeahhh!!..Number is Armstrong");
		}
		else
			System.out.println("Ooops!!..Number is NOT Armstrong");
	}
	public void isPalindrome(int n)
	{
		int n1=n,rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1)
		{
			System.out.println("Number is Palindrome");
		}
		else
			System.out.println("Number is Not Palindrome");
	}	
	/*
	 * In this loop rotate till highest number of both and if both are divisible it will overwrite the past hcf
	 */
	public void findHCF(int n1,int n2)
	{
		int i,hcf=0;
		for(i=1;i<=n1 || i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("HCF is : "+hcf);
	}
	public void divisorOrFactor(int n)
	{
		int i,count=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("total :"+count);
	}
	public void lcm(int n1,int n2)
	{
		int i,hcf=1,lcm=1;
		for(i=1;i<=n1 || i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		lcm=(n1*n2)/hcf;
		System.out.println(lcm);
	}
	public void primeOrNot(int n)
	{
		int i=2,count=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				count=1;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
		
	}
	//find prime numbers in given range
	public void primeNumRange(int snum,int endnum)
	{
		int count=0;
		for(int i=snum;i<endnum;i++)
		{
			boolean isPrime=true;
			if(i==1)
			{
				isPrime=false;
			}
			else
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					System.out.print(i+" ");
					count++;
				}
			}
		}
		System.out.println("\nTotal prime numbers in given range are :"+count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
