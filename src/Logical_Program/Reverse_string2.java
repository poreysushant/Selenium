package Logical_Program;

public class Reverse_string2
{
	public static void main(String[]args)
	{
	    String Org="Sushant";
	    String Rev="";
	    
	    for(int i=Org.length()-1; i>=0; i--)
	    {
	    	Rev=Rev+Org.charAt(i);
	    }
	    
	    System.out.println(Rev);
	}

}
