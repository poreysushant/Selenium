package Logical_Program;

import java.util.Scanner;

import org.testng.annotations.BeforeClass;

public class Reverse_num_String_builder_class 
{
	private static String rev;

	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=Scan.nextInt(); //1234
		
		
	StringBuilder sbl=new StringBuilder();
	sbl.append(num);
	sbl.reverse();
	
	System.out.println("Reverse Number is:" +rev);
	


}
}
