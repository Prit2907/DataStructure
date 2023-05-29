package singlyLL;

public class TestMain {

	public static void main(String[] args) 
	{
		/*
		 * LinkedList ls=new LinkedList(); ls.append(30); ls.append(40); ls.insert(20);
		 * ls.insert(10); System.out.println(ls); ls.insertByPos(3,50);
		 * ls.insertByPos(5,60); System.out.println(ls); ls.deleteFirst();
		 * System.out.println(ls); ls.deleteLast(); System.out.println(ls);
		 * ls.insertByPos(1,90); ls.insertByPos(6,100); System.out.println(ls);
		 * ls.deleteByPos(1); ls.deleteByPos(4); System.out.println(ls);
		 * ls.deleteByPos(4); System.out.println(ls);
		 */
		
		LinkedList ls=new LinkedList();
		ls.append(10);
//		ls.append(20);
//		ls.append(30);
//		ls.append(40);
//		ls.append(50);
//		ls.append(60);
//		ls.append(70);
//		ls.append(80);
//		ls.append(90);
//		ls.append(100);
//		ls.append(110);
//		ls.append(120);
//		ls.append(130);
//		ls.append(140);
//		ls.append(150);
//	
		/*
		 * //9.Print linkedlist in reverse order using recursion ls.revPrint();
		 * System.out.println("Before reversing LL --> "+ls);
		 */		
		
		/*
		 * //10.Reverse linkedlist using 3 iterartor ls.revLL3Iterator();
		 * System.out.println("After reversing LL --> "+ls);
		 */
		
		/*
		 * //11.Reverse linkedlist using Recursion
		 * System.out.println("Before reversing LL --> "+ls); ls.revRecu();
		 * System.out.println("After reversing LL --> "+ls);
		 */
		
		/*
		 * //12.Reverse linked list using Stack (MAINTAINED 2nd LIST as Stack)
		 * System.out.println("Before reversing LL --> "+ls); ls.reverseUsingStack();
		 */
		
		/*
		 * //13.Print Alternate nodes At ODD and EVEN Position ls.printAlternate();
		 */
		
		
		/*
		 * //14.Delete Alternate Nodes @ EVEN POSITION
		 * System.out.println("Before Deleting EVEN Alternate Nodes --> "+ls);
		 * ls.deleteAlterEvenNodes();
		 * System.out.println("After Deleting EVEN Alternate Nodes --> "+ls);
		 */
		  
		
		/*
		 * //15.Delete Alternate Nodes @ ODD POSITION
		 * System.out.println("Before Deleting ODD Alternate Nodes --> "+ls);
		 * ls.deleteAlterOddNodes();
		 * System.out.println("After Deleting ODD Alternate Nodes --> "+ls);
		 */
		 
		/*
		 * //16.Find middle of algorithm (Floyd's Algorithm) Node
		 * middle=ls.findMiddle(); System.out.println(middle.getData());
		 */
		
		
		/*
		 * LinkedList ls1=new LinkedList(); ls1.append(10); ls1.append(20);
		 * ls1.append(30); ls1.append(40); ls1.append(50); ls1.append(60); 
		 * //17.2Linkedlist's write isIdentical boolean result=ls1.isIdentical(ls1,ls);
		 * if(result) { System.out.println("Yes!!!both LL's are identical"); } else
		 * System.out.println("No!!!both LL's are not identical");
		 */
		
		
		  //18.isPalindrome or not 
			LinkedList ls2=new LinkedList(); ls2.append(10);
		  ls2.append(20); ls2.append(30); ls2.append(40); ls2.append(40);
		  ls2.append(30); ls2.append(20); ls2.append(10); 
			boolean result=LinkedList.isPalindrome(ls2); if(result) {
		  System.out.println("Yes!!!it is Palindrome"); } else
		  System.out.println("No!!!it's not Palindrome");
		  
		  System.out.println(ls2);
		 
		
		/*
		 * //19.create internal cycle then detect it and remove/(internal loop)
		 * //a)creating cycle ls.insertCycle(40); //b)detect cycle Node
		 * c=ls.findCycle(); //System.out.println(ls); System.out.println(c.getData());
		 * //c)find length and remove cycle ls.findLenAndRemCycl(c);
		 * System.out.println("after removing cycle"+ls);
		 */
	
		/*
		 * //20.Return the N th last Node of LL Node it=ls.findNthLastNode(7);
		 * System.out.println(it);
		 */
		
		/*
		 * //21.Swap two adjacent nodes System.out.println(ls); ls.swapAdjcNodes();
		 * System.out.println(ls);
		 */
		
		
		/*
		 * //22.for a given (k>0) value reverse blocks of k nodes in a list
		 * System.out.println(ls); ls.reverseKnodes(6); System.out.println(ls);
		 */
		 
		}

}
