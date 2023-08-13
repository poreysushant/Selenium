package Practice_Logicalprogram;

public class Reverse_String1 
{
	public static void main(String[] args) 
	{
		String org="sushant";
		String Rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			Rev=Rev+org.charAt(i);
		}
		System.out.println(Rev);
		
	}

}
