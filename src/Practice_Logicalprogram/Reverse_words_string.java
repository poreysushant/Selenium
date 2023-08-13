package Practice_Logicalprogram;

public class Reverse_words_string 
{
	public static void main(String[] args) 
	{
		String S="My Name Is Sushant Porey";
		String rev="";
		
		String a[]=S.split(" ");
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);
		
	}

}
