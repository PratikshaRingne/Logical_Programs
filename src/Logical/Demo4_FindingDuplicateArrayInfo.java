package Logical;

 
public class Demo4_FindingDuplicateArrayInfo 
{
	public static void main(String[] args) 
	{
		int [] ar= {5,7,8,7,6,5,8};
		
		  
		  
		
		for(int i=0;i<ar.length;i++)
		{
			 
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					 
					System.out.println(ar[i]);
				}
				 
				
				
			}
			 
			 
			 
		}
	}

}
