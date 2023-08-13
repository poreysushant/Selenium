package Logical_Program;

public class White_Spaces 
{
	public static void main(String[] args) 
	{
		String Org="ab c d e f ";
		
		int Count=0;  //5
		
		//i=0 0<=6 
		
		for(int i=0; i<=Org.length()-1; i++)
		{
			char charvalue=Org.charAt(i);
			
		
			if(charvalue==' ')
			{
				Count++;
			}
		}
		System.out.println(Count);
		
	}

}
