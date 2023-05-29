package pattern;

import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args)
	{
		Pattern p=new Pattern();
		p.pattern16();
		/*
		 * Pattern p1=new Pattern(); System.out.println("Enter side of square"); Scanner
		 * sc=new Scanner(System.in); int n=sc.nextInt(); p1.pattern17(n);
		 */
	}
	public void pattern1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern2()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public void pattern3()
	{
		for(int i=1;i<=4;i++)
		{
			int n=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n);
				n++;
			}
			System.out.println();
		}	
	}
	public void pattern4()
	{
		for(int i=1;i<=4;i++)
		{
			char ch='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);	
				ch++;
			}
			System.out.println();
		}
	}
	public void pattern5()
	{
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;		
			}
			System.out.println();
		}	
	}
	public void pattern6()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);				
			}
			System.out.println();
		}
		for(int k=2;k>=1;k--)
		{
			for(int l=1;l<=k;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}	
	}
	public void pattern7()
	{
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	static int m=8;
	public void pattern8()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=8;k>2*i;k--)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int l=8;l>m;l--)
			{
				System.out.print(" ");
			}
			m=m-2;
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern9()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern10()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int m=i;m>=1;m--)
			{
				System.out.print(m);	
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();		
		}
	}
	public void pattern11()
	{
		for(int i=1;i<=15;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
					System.out.print(1);
			}
			/*
			 * for(int j=1;j<=i;j++) { if(i==j || i-j==2 || i-j==4) { System.out.print(1); }
			 * else System.out.print(0); }
			 */
			System.out.println();
		}
	}
	//Pascal's Traingle
	public void pattern12()
	{
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					arr[i][j]=1;
				}
				else
				{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void pattern13()
	{
		int n=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(n==10)
				{
					n=n%10;
					System.out.print(n);
				}
				else
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}
	public void pattern14()
	{
		String s="loveINDIA";
		for(int i=1;i<=s.length();i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(s.charAt(j-1));
			}
			System.out.println();
		}
	}
	//Same As PASCAL
	public void pattern15()
	{
		char arr[][]=new char[10][10];
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j)
				{
					arr[i][j]='!';
					System.out.print(arr[i][j]);
				}
				else
				{
					arr[i][j]='*';
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}

	//pattern 16 from Reflexive test NWking
	public void pattern16()
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j=1;j<=n;j++)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print(" ");
			}
			for(int l=j;l<(j*2)-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//pattern 17 * Square
	public void pattern17(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i!=0 && i!=n-1) && (j!=0 && j!=n-1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	

	
	
	
	
	
	
	
}