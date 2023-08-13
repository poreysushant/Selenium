package Practice_Logicalprogram;

import java.util.Scanner;

public class Even_Odd_Scanner1 
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Enter Num:");
		int Num=Scan.nextInt();
		
		if(Num%2==0)
		{
			System.out.println("Given No Is Even");
		}
		else
		{
			System.out.println("Given No Is Odd");
		}
		
	}

}
