package Inerview_program;

import java.util.Scanner;

public class Even_odd_by_Scanner_method 
{
	public static void main(String[] args) 
	{
		
	Scanner Scan=new Scanner (System.in);
	
	System.out.println("Enter Num:");
	
	int Num=Scan.nextInt();
	if(Num%2==0)
	{
		System.out.println("Given Number Is Even");
	}
	else
	{
		System.out.println("Given Number Is Odd");
	}
	
	
	
	}
}
