package Logical_Program;

import java.util.Scanner;

public class Add_2_No_by_taking_input_from_User 
{
	//Add 2 No by taking input from user
	
	public static void main(String[] args) 
	{
		//Create object of Scanner class
		Scanner Scan=new Scanner(System.in);
		
		//call the method
		System.out.println("Enter Num1:");
		int Num1=Scan.nextInt();
		System.out.println(Num1);                //10
		
		//call the method
		System.out.println("Enter Num2:");
		int Num2=Scan.nextInt();
		System.out.println(Num2);                //20
		
		//Add the number
		System.out.println(Num1+Num2);
		
		//Perform Multiplication
		System.out.println(Num1*Num2);
		
	}

}
