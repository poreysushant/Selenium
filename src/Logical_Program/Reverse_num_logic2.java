package Logical_Program;

import java.util.Scanner;

public class Reverse_num_logic2 
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=Scan.nextInt(); //1234
		
		int rev =0;
		while(num!=0)
		{
			rev=rev*10 +num %10;
			num=num/10;
		}
		System.out.println(rev);
		
	}

}
