package Logical_Program;

public class swipe_num_using_third_variable 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		int c=a; //10
		a=b;     //20
		b=c;     //10
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
