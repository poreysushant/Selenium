package Inerview_program;

public class Reverse_String2 
{
	public static void main(String[] args) 
	{
		String a="DhananjayPorey";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
	}

}
