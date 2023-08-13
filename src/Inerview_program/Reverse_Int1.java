package Inerview_program;

public class Reverse_Int1 
{
	public static void main(String[] args) 
	{
		int a=1234;
		int b=0;
		
		for(int i=a; i>0; i=i/10)
		{
			int c=i%10;
			b=b*10+c;
		}
		System.out.println(b);
		
	}

}
