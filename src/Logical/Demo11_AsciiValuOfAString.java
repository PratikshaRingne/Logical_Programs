package Logical;

public class Demo11_AsciiValuOfAString 
{
	public static void main(String[] args) 
	{
		String s1="Hello, World";
		
		int sum=0;
		
	    for(int i=0;i<s1.length();i++)
	    {
	    	char ch=s1.charAt(i);
	    	
	    	int asciivalue=(int)ch;
	    	
	    	System.out.println(ch+" = "+asciivalue);
	    	
	    	sum=sum+asciivalue;
	    	
	    }
	    System.out.println("___________\n"+sum);
		
	}

}
