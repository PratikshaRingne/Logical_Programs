package Logical;

public class Swap_Number 
{
	public static void main(String[] args) 
	{
		int a=50;
		int b=80;
		
		System.out.println("--Befor Swapping--");
		
		System.out.println("a="+a+"\nb="+b);
		
		a=a+b; //a=130
		b=a-b; //b=50
		a=a-b; //a=80
		
		System.out.println("--After Swapping--");
		
		System.out.println("a="+a+"\nb="+b);
		
		
	}

}
