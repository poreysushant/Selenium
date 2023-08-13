package Practice_Logicalprogram;

public class Reverse_String3 
{
	public static void main(String[]args)
	{
		String org="Harshad";
		String Rev="";
		
		for(int i=org.length()-1; i>=0; i--)
			
		{
			Rev=Rev+org.charAt(i);
		}
		System.out.println(Rev);
	}

}
