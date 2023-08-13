package Exception;

public class Exceptionhandling1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		int c;
		try
		{
			c=a/b;     //Risky code--->Exception
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled");
			c=a/1;
		}
		System.out.println(c);
		
		System.out.println("Hi.....");
		
	}

}
