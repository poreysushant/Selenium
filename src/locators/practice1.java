package locators;

public class practice1 
{
	public static void main(String[] args) 
	{
		
	String str="Sushant Porey";

	int length=str.length();

	char[]ch=str.toCharArray();

	for(int i=0; i<length; i++)

	{
	for(int j=i+1; j<length; j++)

	{
	 if(ch[i]==ch[j])
	 {
	
	  System.out.println("Duplicate char are: "+ch[j]);
	  break;
	}
	}
	}
	}
}
	
