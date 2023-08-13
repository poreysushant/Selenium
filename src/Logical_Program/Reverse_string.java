package Logical_Program;

public class Reverse_string 
{
	public static void main(String[] args) 
	{
		String Org="Virat";          //tariV
		
		String Rev="";        
		
		//i=4    4>=0  
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			Rev=Rev+Org.charAt(i);    //tariV
		}
		
		System.out.println(Rev);
		
	}

}
