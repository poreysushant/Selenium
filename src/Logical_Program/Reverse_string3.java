package Logical_Program;

public class Reverse_string3 
{
	public static void main(String[]args)
	{
		String a="Prashant";
		String Rev="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			Rev=Rev+a.charAt(i);
			
		}
		System.out.println(Rev);
	}

}
