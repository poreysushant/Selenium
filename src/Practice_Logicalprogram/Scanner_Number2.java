package Practice_Logicalprogram;

import java.util.Scanner;

public class Scanner_Number2 
{
	public static void main(String[] args) 
	{
		//create object of scanner class
		
		Scanner Scan=new Scanner(System.in);
		
		//call the method
		
		System.out.println("Enter Num1:");
		int Num1=Scan.nextInt();
		System.out.println(Num1);
		
		//call the method
		
		System.out.println("Enter Num2:");
		int Num2=Scan.nextInt();
		System.out.println(Num2);
		
		//Addition perform
		System.out.println(Num1+Num2);
		
		//Multiplication perform
		System.out.println(Num1*Num2);
		
	}

}
