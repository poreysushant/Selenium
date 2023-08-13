package Logical_Program;

import java.util.Scanner;

public class Even_odd 
{
	//Even or Odd
	
	public static void main(String[] args) 
	{
		//Create object of scanner class
		Scanner Scan=new Scanner(System.in);
		
		//Call the methods
		System.out.println("Enter Num:");
		int Num=Scan.nextInt();
		
		if(Num % 2==0)
		{
			System.out.println("Given No is even");
		}
		else
		{
			System.out.println("Given No is odd");
		}
		
	}

}
