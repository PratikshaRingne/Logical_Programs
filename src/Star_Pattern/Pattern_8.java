package Star_Pattern;

public class Pattern_8 
{
	public static void main(String[] args) 
	{
		//
		//    *
		//   * *
		//  * * *
		
		int star=1;
		int spaces=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.println(" ");
			}
			 
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			star++;
			spaces--;
			
			
			System.out.println(" ");
			
		}
		
	}

}
