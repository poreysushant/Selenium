package Inerview_program;

public class Reverse_String1 
{
	public static void main(String[] args) 
	{
		String a="Sushant";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		
	}

}
