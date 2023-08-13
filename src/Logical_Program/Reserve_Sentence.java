package Logical_Program;

public class Reserve_Sentence 
{
	public static void main(String[] args) 
	{
		String org="I am Playing";
		
		String Text=reverseSentence(org);
		
		System.out.println(Text);
		
	}
	public static String reverseSentence(String Sentence)
	{
		String ar[]=Sentence.split(" ");
		
		String rev="";       //Playing am I
		
		//i=2   2>=0  1
		for(int i=ar.length-1; i>=0; i--)
		{
			rev=rev+ar[i]+"";
		}
		
		return rev;                   //Playing am I
	}

}
