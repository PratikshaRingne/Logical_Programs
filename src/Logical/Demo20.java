package Logical;

import java.util.Arrays;

public class Demo20 
{
	public static void main(String[] args) 
	{
		String S1="Hii ! I Am Pratiksha";
		
		String[]ar= S1.split(" ");
		
		System.out.println(ar.length);
		
		 for(int i=0;i<ar.length;i++)
		 {
			System.out.println(ar[i]); 
		 }
		 System.out.println("___________\n");
		 
		 
		 for(int i=ar.length-1;i>=0;i--)
		 {
			System.out.println(ar[i]); 
		 }
		
	}

}
