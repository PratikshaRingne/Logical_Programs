package Logical;

public class Demo3_DuplicateChar 
{
	public static void main(String[] args) 
	{
		String s1="APPLICATION";
		
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='P')
			{
				 count++;
			}
			
		}
		System.out.println(count);
		
	}

}
