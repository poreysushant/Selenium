package Practice_Logicalprogram;

public class Reverse_String5 
{
	public static void main(String[] args) 
	{
		String org="Prashant";
		String rev="";
		
		
			for(int i=org.length()-1; i>=0; i--)
			{
				rev=rev+org.charAt(i);
			}
                
			System.out.println(rev);
		
	}

}
