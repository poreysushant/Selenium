package Logical_Program;

public class Prime_No 
{
	public static void main(String[] args) 
	{
		int num=7;
		
		int count=0;  //1
		
		//i=2   2<7
		
		for(int i=2; i<num; i++)
		{
			//0==0
			if(num % i==0)
			{
				count++;
				break;
			}
		}
		
		//1==1
		if(count==1)
		{
			System.out.println("Given no is not a prime no");
		}
		else
		{
			System.out.println("Given no is a prime no");
		}
		
	}

}
