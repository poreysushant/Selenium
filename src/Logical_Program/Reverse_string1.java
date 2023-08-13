package Logical_Program;

public class Reverse_string1 
{
	public static void main(String[] args) 
	{
		String a="Abhijit";
		String rev="";
		
		int b=a.length();
		
		for(int i=b-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
			
		
	}

}
