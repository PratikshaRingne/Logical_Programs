package Logical;

public class Demo1_ContingWhiteSpaces 
{
	
	 public static void main(String[] args) 
	 {
		 String s1="ab cd ef";
		 
		 int count=0;
		
		 for(int i=0;i<s1.length();i++)
		 {
			char ch=s1.charAt(i)  ;
			
			if(ch== ' ')
			{
				count++;
			}
		 }
		 System.out.println(count);
		
	}
	

}
