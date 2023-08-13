package Logical_Program;

import java.util.Scanner;

public class Reverse_num_string_buffer_class 
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=Scan.nextInt(); //1234
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse Number is:" +rev);
		
		
	}

}
