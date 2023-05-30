package Star_Pattern;

public class Pattern_12 
{
	public static void main(String[] args) 
	{
		// *
		//* *
	//   * * *
		
		int star=1;
		int spaces=2;
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			star++;
			spaces--;
			System.out.println();
		}
		
	}

}
