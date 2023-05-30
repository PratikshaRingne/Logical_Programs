package Logical;

public class Demo21 
{
	public static void main(String[] args) 
	{
		//Reverse string by Split method
		
		String s1="Pratiksha";
		
		String[] d = s1.split("");
		
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.print(d[i]);
		}
		
	}

}
