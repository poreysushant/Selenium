package Practice_Logicalprogram;

public class Reverse_String7 
{
	public static void main(String[] args) 
	{
		String a="Dhananjay";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		
	}

}
