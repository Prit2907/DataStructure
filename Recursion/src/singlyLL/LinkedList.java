package singlyLL;

public class LinkedList 
{
	private Node head;
	private static int count;
	static {
		count=0;
	}
	public void append(int data)
	{
		count++;
		Node temp=new Node(data);
		if(head!=null)
		{
			Node it=head;
			while(it.getNext()!=null)
			{
				it=it.getNext();
			}
			it.setNext(temp);
		}
		else
			head=temp;
	}
	public void insert(int data)
	{
		count++;
		Node temp=new Node(data);
		if(head!=null)
		{
			temp.setNext(head);
			head=temp;
		}
		else
		{
			head=temp;
		}
	}
	public void deleteFirst()
	{
		count--;
		Node it=head;
		head=it.getNext();
		it.setNext(null);
	}
	public void deleteLast()
	{
		count--;
		Node it=head;
		Node itp=null;
		while(it.getNext()!=null)
		{
			itp=it;
			it=it.getNext();
		}
		itp.setNext(null);
	}
	public void insertByPos(int pos,int data)
	{
		Node temp=new Node(data);
		if(pos==1)
			insert(data);
		else if(pos==count+1)
			append(data);
		else if(pos<1 || pos>count+1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			int x=1;
			Node it=head;
			while(x<pos-1)
			{
				it=it.getNext();
				x++;
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
		}
		count++;
	}
	public void deleteByPos(int pos)
	{
		if(pos==1)
			deleteFirst();
		else if(pos==count)
			deleteLast();
		else if(pos<1 || pos>count)
			System.out.println("Invalid Position");
		else
		{
			int x=1;
			Node it=head;
			Node itp=null;
			while(x<pos)
			{
				itp=it;
				it=it.getNext();
				x++;
			}
			itp.setNext(it.getNext());
			it.setNext(null);
		}
		count--;
	}
	//9.Print linkedlist in reverse order using recursion
	public void revPrint() 
	{
		reversePrint(head);
	}
	private void reversePrint(Node it)
	{
		if(it.getNext()!=null)
		{
			reversePrint(it.getNext());
		}
		System.out.print(it.getData()+" ");
	}
	//10.Reverse linkedlist using 3 iterartor
	public void revLL3Iterator()
	{
		Node it,itn;
		it=itn=head;
		Node itp=null;
		while(it!=null)
		{
			itn=it.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
		}
		head=itp;
	}
	//11.Reverse linkedlist using Recursion
	public void revRecu()
	{
		reverseRec(head);
	}
	private void reverseRec(Node it)
	{
		if(it.getNext()==null)
		{
			head=it;
			return;
		}
		reverseRec(it.getNext());
		it.getNext().setNext(it);
		it.setNext(null);
	}
	//12.Reverse linked list using Stack (MAINTAINED 2nd LIST as Stack)
	public void reverseUsingStack()
	{
		LinkedList l2=new LinkedList();
		Node it=head;
		while(it!=null)
		{
			l2.insert(it.getData());
			it=it.getNext();
		}
		System.out.println("After reversing LL --> "+l2);
	}
	//13.Print Alternate nodes At ODD and EVEN Position
	public void printAlternate()
	{
		LinkedList odd=new LinkedList();
		LinkedList even=new LinkedList();

		Node it1=head;
		Node it2=head;
		while(it1!=null && it2!=null)
		{
			it2=it1.getNext();
			odd.append(it1.getData());
			if(it2!=null)
			{
				even.append(it2.getData());
				it1=it2.getNext();
			}
		}
		System.out.println("Alternate nodes at odd pos-->"+odd);
		System.out.println("Alternate nodes at even pos-->"+even);
	}
	//14.Delete Alternate Nodes at EVEN POSITION
	public void deleteAlterEvenNodes()
	{
		Node it1=head;
		Node it2=head;
		Node itp=null;
		while(it1!=null && it2!=null)
		{
			it2=it1.getNext();
			itp=it1;
			if(it2!=null)
			{
				it1=it2.getNext();
				itp.setNext(it1);
				it2.setNext(null);
			}
		}
	}
	//15.Delete Alternate Nodes at ODD POSITION
	public void deleteAlterOddNodes()
	{
		Node itp=head;
		head=head.getNext();
	    itp.setNext(null);
		Node it1=head;
		Node it2=head;
//		Node itp=null;
		while(it1!=null && it2!=null)
		{
			it2=it1.getNext();
			itp=it1;
			if(it2!=null)
			{
				it1=it2.getNext();
				itp.setNext(it1);
				it2.setNext(null);
			}
		}
	}
	//16.Find middle of algorithm (Floyd's Algorithm)
	public Node findMiddle()
	{
		Node slow=head;
		Node fast=head;
		int i=0;
		while(fast.getNext()!=null)
		{
			if(i==0)
			{
				fast=fast.getNext();
				i=1;
			}
			else
			{
				fast=fast.getNext();
				slow=slow.getNext();
				i=0;
			}
		}
		return slow;
	}
	//17.Two Linked list's write isIdentical
	public boolean isIdentical(LinkedList l1,LinkedList l2)
	{
		Node it1=l1.head;
		Node it2=l2.head;
		while(it1.getNext()!=null && it2.getNext()!=null)
		{
			if(it1.getData()!=it2.getData())
				return false;
			else
				it1=it1.getNext();
			it2=it2.getNext();
		}
		if(it1.getNext()==null && it2.getNext()==null)
			return true;
		else
			return false;
	}

	//18.isPalindrome or not
	static LinkedList l2;
	public void revRecur(Node it)
	{
		if(it.getNext()==null)
		{
			l2.head=it;
			return;
		}
		revRecur(it.getNext());
		it.getNext().setNext(it);
		it.setNext(null);

	}
	public static boolean isPalindrome(LinkedList l1)
	{
		Node slow=l1.head;
		Node fast=l1.head;
		int x=0;
		while(fast.getNext()!=null)
		{
			if(x==0)
			{
				fast=fast.getNext();
				x=1;
			}
			else if(x==1)
			{
				fast=fast.getNext();
				slow=slow.getNext();
				x=0;
			}
		}
		l2=new LinkedList();
		l2.head=slow.getNext();
		slow.setNext(null);
		
		if(l2.head!=null)
		l2.revRecur(l2.head);

		Node it1=l1.head;
		Node it2=l2.head;
		while(it2!=null)
		{
			if(it1.getData()==it2.getData())
			{
				it1=it1.getNext();
				it2=it2.getNext();
			}
			else
			{			
				//if false reverse list and return false
				l2.revRecur(l2.head);
				slow.setNext(l2.head);
				//				l2.head=null;
				return false;
			}
		}				
		//if true reverse list and make it as it is and return true
		if(l2.head!=null)
		l2.revRecur(l2.head);
		slow.setNext(l2.head);
		//		l2.head=null;
		return true;
	}

	//19.create internal cycle then detect it and remove/(internal loop)
	//creating cycle
	public void insertCycle(int data)
	{
		Node temp=null;
		Node it=head;
		Node itp=null;
		while(it!=null)
		{
			itp=it;
			if(it.getData()==data)
			{
				temp=it;
				it=it.getNext();
			}
			else
				it=it.getNext();

		}
		itp.setNext(temp);
	}
	//detecting cycle
	public Node findCycle()
	{
		Node slow=head;
		Node fast=head;
		while(fast.getNext()!=null)
		{
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			if(slow==fast)
				return slow;
		}
		return null;
	}
	//finding length and remove cycle
	public void findLenAndRemCycl(Node c) 
	{
		Node it1,it2;
		it1=it2=c;
		int cycLen=0,remLen=0;
		//can't take while loop because initially p1=p2
		do 
		{
			cycLen=cycLen+1;
			it2=it2.getNext();
		}while(it1!=it2);

		it2=head;
		while(it1!=it2)
		{
			remLen=remLen+1;
			it1=it1.getNext();
			it2=it2.getNext();
		}
		Node it=head;
		for(int i=1;i<cycLen+remLen;i++)
		{
			it=it.getNext();
		}
		it.setNext(null);

	}

	//20.Return the N th last Node of LL
	public Node findNthLastNode(int N)
	{
		Node it1=head;
		Node it2=head;
		if(N>0)
		{
			for(int i=1;i<N;i++)
			{
				it1=it1.getNext();
			}
			while(it1.getNext()!=null)
			{
				it1=it1.getNext();
				it2=it2.getNext();
			}
			return it2;
		}
		return null;
	}

	//21.Swap two adjacent nodes
	public void swapAdjcNodes()
	{
		Node it=head;
		Node itp=null;
		
		while(it!=null && it.getNext()!=null)
		{
			Node itn=it.getNext();
			it.setNext(itn.getNext());
			itn.setNext(it);
			if(itp==null)
			{
				head=itn;
			}
			else
			{
				itp.setNext(itn);
			}
			itp=it;
			it=it.getNext();
		}
	}

	//22.for a given (k>0) value reverse blocks of k nodes in a list	
	public void revKBlocks(Node itr,int k)
	{
 
		if(itr==null || itr.getNext()==null || k==1)
		{
			return ;
		}
		else
		{

			revKBlocks(itr.getNext(),k-1);
			itr.getNext().setNext(itr);
			itr.setNext(null);
		}
 
	}
	
	public void reverseKnodes(int k) 
	{
		Node it=head;
		Node itp=null;
		Node itn1=head;
		Node itn=null;
		while(it!=null && it.getNext()!=null)
		{

			itn=it;									
		    for(int i=0;i<k;i++) 
		    {
		    	if(itn1!=null)
		    	{
		    		itn1=itn1.getNext(); 
		    	}
		    	else
		    	{
		    		itp.setNext(it);
		    		break;
		    	}
		    }
		   
		    for(int i=1;i<k;i++) 
		    {
		    	if(itn!=null)
		    		itn=itn.getNext(); 
		    	else
		    	{
		    		it=itn;
		    		break;
		    	}
		    }
		    if(itn!=null)
		    {
		    	revKBlocks(it,k);
		    }
		     
			if(itp==null)
			{
				head=itn;
			}
			else
			{
				if(itn!=null)
				{
					itp.setNext(itn);
				}
			}
			itp=it;
 
			it=itn1;
		}
		if(itn1!=null)
		itp.setNext(itn1);
	}
	
	
	
	
	

	
	@Override
	public String toString() 
	{
		String str="";
		Node it=head;
		while(it!=null)
		{
			str+=it.getData()+" ";
			it=it.getNext();
		}
		return str;
	}
}
