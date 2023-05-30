package Logical;

public class Demo8_Fabonacci_Series 
{
	public static void main(String[] args) 
	{
		//Printing fabonacci series from 5 to 100
		
		int n1=0;
		int n2=1;
		int n3;
		
		 while(n1+n2<=250)
		{
			n3=n1+n2;
			if(n3>=13)
			{
				System.out.print(" "+n3);
				
			}
			
			n1=n2;
			n2=n3;
			
		}
		
	}

}
