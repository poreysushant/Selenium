package Star_Pattern;

public class Star8 
{
	//  *
	 //* *
    //* * *
   //* * * *
  //* * * * *
	
	public static void main(String[] args) 
	{
		for(int a=1; a<=5; a++)
		{
			for(int i=5; i>a; i--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=a; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
