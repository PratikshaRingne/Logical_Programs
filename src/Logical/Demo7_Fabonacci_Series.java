package Logical;

public class Demo7_Fabonacci_Series
{
	public static void main(String[] args) 
	{
		int n=10;
		
		int firstNum=0;
		int secondNum=1;
		
		System.out.print(firstNum + " " + secondNum);
		
		for(int i=2;i<n;i++)
		{
			int nextNum = firstNum+secondNum;
			
			System.out.print(" "+ nextNum);
			
			firstNum = secondNum;
		   secondNum = nextNum;
			
			
		}
		
	}

}
