package Logical;

public class Demo22 
{
	public static void main(String[] args) 
	{
		String S1="validation";
		
		String rev="";
		
		for(int i=S1.length()-1;i>=0;i--)
		{
			char d = S1.charAt(i);
			rev=rev+d;
		}
		System.out.println(rev);
		
		if(S1.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");

		}
		
	}

}
