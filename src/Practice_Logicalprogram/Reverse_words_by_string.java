package Practice_Logicalprogram;

public class Reverse_words_by_string 
{
	public static void main(String[] args) 
	{
		String org="sushant dhananjay porey";
		String rev="";
		
		String a[]=org.split(" ");
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);
		
	}

}
