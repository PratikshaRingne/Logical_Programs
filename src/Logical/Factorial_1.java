package Logical;

public class Factorial_1 
{
	public static void main(String[] args) 
	{
		//10
		
		System.out.println("Factorial of 10="+(10*9*8*7*6*5*4*3*2*1));
		
		int fact=1;
		for(int i=10;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
