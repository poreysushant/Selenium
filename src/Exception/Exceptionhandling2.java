package Exception;

public class Exceptionhandling2 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[5];
		
		try
		{
			ar[6]=10;       //Risky code---->Exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		
		System.out.println("Hi....");
		
	}

}
