package Logical;

public class Demo19 
{
	public static void main(String[] args) 
	{
		String S1=" Hii ! I Am Pratiksha ";
		
		String S2="madam";
		String S3="MADAM";
		
		System.out.println(S1.substring(7, 22));
		
		System.out.println(S1.substring(4));
		
		System.out.println(S1.replace("Pratiksha", "Priti"));
		
		System.out.println(S1.length());
		
		System.out.println(S1.isEmpty());
		
		System.out.println(S1.charAt(5));
		
		System.out.println(S1.indexOf('i'));
		
		System.out.println(S1.lastIndexOf('i'));
		
		System.out.println(S2.equals(S3));
		
		System.out.println(S2.equalsIgnoreCase(S3));
		
	}

}
