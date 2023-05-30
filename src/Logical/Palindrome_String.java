package Logical;

public class Palindrome_String 
{
	public static void main(String args[]) 
	{
		String S1="madam";
		
		String rev="";
		
		for(int i=S1.length()-1;i>=0;i--)
		{
			rev=rev+S1.charAt(i);
		}
		System.out.println(rev);
		
		if(S1.equals(rev))
		{
			System.out.println("Given String Is Palindrome");
		}
		else
		{
			System.out.println("Given String Is NOT Palindrome");
		}
		
	}

}
