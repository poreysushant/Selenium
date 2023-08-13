package Practice_Logicalprogram;

public class Reverse_String4 
{
	public static void main(String[] args) 
	{
		String org="sushant";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
			
		}
		
			System.out.println(rev);
		
		
	}

}
