package Logical;

public class Demo16 
{
	public static void main(String[] args) 
	{
		//Print 1 to 50 prime numbers
		
		
		for(int i=1;i<=50;i++)
		{
			int count=0;
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
