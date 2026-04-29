//Name:
//ID:
//Section:

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//************* YOU MUST NOT USE LOOPS IN THIS LAB *******************
public class ITDS121LabRecursion {
	
	public static int sumNatural(int n)
	{
		//=========== YOUR CODE HERE =============//
		//Hint: What is the smallest n that can be return without computation (base case)?
		//Hint: Assuming that sumNatural(n-1) has been computed, how would you combine n with sumNatural(n-1) before returning (recursive case))?
		if(n == 1)
			return 1;
		else if(n > 1)
			return n + sumNatural(n-1);
		else
			return 0;
		
		//=======================================//
	}
	
	public static boolean isPalindrome(char[] d)
	{
		//=========== YOUR CODE HERE =============//
		//Hint: May find it easier to use a helper method 
		if(d.length == 0 || d.length == 1)
			return true;
		else
			//call helper method with start and end index of the whole array
			return isPalindromeHelper(d, 0, d.length-1);
		
		//=======================================//
	}
	
	//=========== YOUR CODE HERE (**You may need this helper method. If not, then ignore it.**) =============//
	public static boolean isPalindromeHelper(char[] d, int start, int end)
	{
		//Hint: What are the values of start and end, that you can answer directly if d[start] ... d[end] is a palindrome (base case 1)?
		//Hint: What are the values of d[start] and d[end] that you can answer directly that d[start] ... d[end] is NOT a palindrome (base case 2)?
		//Hint: How would you call to this method again with a smaller problem (recurive case)?
		if(start >= end)
			return true;
		else if(d[start] != d[end])
			return false;
		else
			return isPalindromeHelper(d, start+1, end-1);
	}
	//=======================================//
	

	public static void printReverse(Queue<String> q)
	{
		//=========== YOUR CODE HERE =============//
		//Hint: What is the size of q that do can simply return without printing anything (base case)?
		//Hint: You might want to hold on to the first element, while leaving the rest of q for the recurisve call to deal with.
		//Hint: Then after the recurive call has return, it's now your turn to print the element you held.
		if(q.size() == 0)
			return;
		else
		{
			String first = q.poll();
			printReverse(q);
			System.out.print(first+" ");
		}
		
		System.out.print("");
		
		//=======================================//
	}

	public static void main(String[] args) {
		System.out.println("======== Task01 ==========");
		System.out.println("sumNatural(1) = "+sumNatural(1));
		System.out.println("sumNatural(10) = "+sumNatural(10));
		System.out.println("sumNatural(100) = "+sumNatural(100));
		
		System.out.println("======== Task02 ==========");
		char[][] str = {{'A', 'B', 'C', 'B', 'A'}
		, {'A', 'B', 'B', 'A'}
		, {'A', 'B', 'B', 'B', 'B', 'B', 'B', 'C', 'D', 'C', 'B', 'B', 'B', 'B', 'B', 'A'}
		, {'A', 'B', 'B', 'B', 'B', 'B', 'B', 'C', 'D', 'C', 'B', 'B', 'B', 'B', 'B', 'B', 'A'}
		, {'A', 'B', 'B', 'B', 'B', 'B', 'B', 'C', 'D', 'C', 'B', 'B', 'B', 'B', 'B', 'B', 'A', 'A'}
		, {'A', 'B', 'B', 'B', 'B', 'B', 'B', 'C', 'D', 'I', 'B', 'B', 'B', 'B', 'B', 'B', 'A'}};
		for(int i = 0; i < str.length; i++)
		{
			System.out.println("str["+i+"] is "+(isPalindrome(str[i])?"":"NOT ")+"a palindrome.");
		}
		
		System.out.println("======== Task03 ==========");
		Queue<String> q1 = new LinkedList<String>(Arrays.asList(new String[]{"Ant", "Rabbit", "Cat"}));
		Queue<String> q2 = new LinkedList<String>(Arrays.asList(new String[]{"DST", "is", "the", "best"}));
		Queue<String> q3 = new LinkedList<String>(Arrays.asList(new String[]{"ITDS", "121", "is", "very", "easy"}));
		System.out.println("printReverse(q1):");
		printReverse(q1);
		System.out.println("\nprintReverse(q2):");
		printReverse(q2);
		System.out.println("\nprintReverse(q3):");
		printReverse(q3);
		
	}
}
