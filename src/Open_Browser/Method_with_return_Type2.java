package Open_Browser;

public class Method_with_return_Type2 
{
	public static void main(String[]args)
	{
		int Num1=50;
		
		int Num2=addition(10,60);
		System.out.println(Num2);  //70
		
		System.out.println(Num1*Num2);
		
		System.out.println(Num1+Num2);
	}
	
	public static int addition(int a, int b)
	{
		int sum=a+b;    //10+60
		System.out.println(sum);  //70
		
		return sum;  //70
	}

}
