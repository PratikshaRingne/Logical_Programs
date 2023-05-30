package Logical;

public class Demo23 
{
	public static void main(String[] args)
	{
		// Reverse the given num
		
		int num=45623;
		int rem;
		int rev=0;
		
		 while(num!=0)
		 {
			 rem=num%10;
			 rev=rev*10 + rem;
			 num=num/10;
			 
		 }
		 System.out.println(rev);
		
	}

}
