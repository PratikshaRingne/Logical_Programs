package Logical;

public class Demo15 
{
	public static void main(String[] args) 
	{
		// num is prime or not
		
		int num=15;
		 int count=0;
		
		 for(int i=1;i<=15;i++)
		 {
			
			
			 if(num%i==0)
			 {
				 count++;
				 
			 }
			 
		 }
		 if(count==2)
		 {
			 System.out.println("num is prime");
		 }
		 else
		 {
			 System.out.println("num is not prime");
			 
		 }
	}

}
