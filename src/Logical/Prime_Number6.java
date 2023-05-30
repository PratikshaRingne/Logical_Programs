package Logical;

public class Prime_Number6 
{
	//Print Prime Numbers From 1 to 20
	
	public static void main(String[] args) 
	{
		for(int i=1;i<=20;i++)
		{
			int temp=0;
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			
			if(temp==2)
			{
				System.out.println(i);
			}
			 
				
		}
		
	}

}
