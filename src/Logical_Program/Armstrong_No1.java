package Logical_Program;

public class Armstrong_No1 
{
	//153=1   5     3
	//    1  125   27 =153
	
	public static void main(String[] args) 
	{
		int Org=153;
		int Sum=0;     //153
		
		//i=153    153>0   153/10=15.3
		          //15>0    15/10=1.5
		          //1>0
		
		for(int i=Org; i>0; i=i/10)
		{
			//1% 10=1
			int rem=i%10;
			
			Sum=Sum+(rem*rem);     //152+1
		}
		System.out.println(Sum);
		
		if(Org==Sum)
		{
			System.out.println("Given No is an Armstrong no");
		}
		
		else
			
		{
			System.out.println("Given No is not an Armstrong no");
		}
		
		
		
	}

}
