package Logical;

public class Demo17 
{
	public static void main(String[] args) 
	{
		//find the prime numbers from an array
		
		int [] ar= {2,31,4,1,8,71,6,45,21,23,74,69,83,27,41};
		
		 
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			
			 for(int j=1;j<=ar[i];j++)
			 {
                if(ar[i]%j==0)
                {
                    count++;	
                }
				 
			 }
			 if(count==2)
			 {
				 System.out.println(ar[i]);
			 }
			
			
		}
		
	}

}
