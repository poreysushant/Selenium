package Logical_Program;

public class pallendrome 
{
	public static void main(String[] args) 
	{
		String Org="madam";
		
		String Rev="";          //madam
		
		//i=4    4>=0
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			Rev=Rev+Org.charAt(i);      //madam
		}
		System.out.println(Rev);
		
		if(Org.equals(Rev))
		{
			System.out.println("Given string is a pallendrome");
		}
		else
		{
			System.out.println("Given string is not a pallendrome");
		}
		
	}

}
