package Practice_Logicalprogram;

public class Count_repated_char_string 
{
	public static void main(String[] args) 
	{
		
	String a="sushant";
	int b=a.length();
	char[]ch=a.toCharArray();
	
	for(int i=0; i<b; i++)
	{
	for(int j=i+1; j<b; j++)
	{
		if(ch[i]==ch[j])
		{
			System.out.println("Duplicate charracters are: "+ch[j]);
		}
			
		}
	}

}
}
