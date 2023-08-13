package Logical_Program;

public class swipe_num_logic3 
{
	public static void main(String[] args) 
	{
		
	
	//use multiplication and division operator
	//without using third variable
	//here a & b value should not be zero
	
	int a=10;
	int b=20;
	
	a=a*b;  //10*20=200
	b=a/b;  //200/20=10
	a=a/b;  //200/10=20
	
	System.out.println(a);
	System.out.println(b);

}
}
