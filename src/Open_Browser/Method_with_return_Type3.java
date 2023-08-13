package Open_Browser;

public class Method_with_return_Type3 
{
	public static void main(String[]args)
	{
		String str="velocity";
		
		String Str2=convertstringtoUppercase(str);
		System.out.println(Str2);
	}
	public static String convertstringtoUppercase(String S1)
	{
		String S2=S1.toUpperCase();   //VELOCITY
		
		return S2;
	}

}
