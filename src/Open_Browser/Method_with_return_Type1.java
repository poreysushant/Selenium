package Open_Browser;

public class Method_with_return_Type1 
{
	public static void main(String[]args)
	{
		int Num1=addition(10,20);
		System.out.println(Num1);
	}
	public static int addition(int a, int b)
	{
		int sum=a+b;      //10+20
		System.out.println(sum);  //30
		
		return sum;      //30
	}

}
