package Logical;

public class Demo6
{
	public static void main(String[] args) 
	{ 
		int num=85858;
		
		int i=num;
		
		int rev=0;
		 
		
		 while(i!=0)
		 {
			 int rem=i%10;
			 rev=rem+ rev*10;
			 num=i%10;
			 
		 }
		 System.out.println(rev);
		 
	}

}
