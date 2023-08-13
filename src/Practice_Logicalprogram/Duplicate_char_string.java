package Practice_Logicalprogram;

public class Duplicate_char_string 
{
	public static void main(String[] args) 
	{
		String str="prashant kalmegh";
		int length=str.length();
		char[]ch=str.toCharArray();
		
		for(int i=0; i<length; i++)
		{
		
		for(int j=i+1; j<length; j++)
		{
		   if(ch[i]==ch[j])
				{
					System.out.println("Duplicate character are: "+ch[j]);
					break;
				}
		}
		
	}

}
}
