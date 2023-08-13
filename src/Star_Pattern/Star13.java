package Star_Pattern;

public class Star13 
{
	//* * * * *
	//  * * * *
	//    * * *
	//      * *
	//        *
	//      * *
	//    * * *
	//  * * * *
	//* * * * *

public static void main(String[] args)
{
	int space=0; //-1
	int star=5; //6
	
	        //i=1    1<=9    2
	                //2<=9    3
	                //3<=9   4
	               //4<=9    5
	               //5<=9    6
	               //6<=9    7
	               //7<=9    8
	               //8<=9     9
	               //9<=9     10
	              //10<=9
	for(int i=1;     i<=9;   i++) 
	{
		        //a=1    1<=0
		for(int a=1;     a<=space; a++) 
		{
			System.out.print(" ");
		}
		 
		for(int b=1;   b<=star; b++) 
		{
			System.out.print("*");
		}
		System.out.println();
		
		if(i<=4)  //9<=4 
		{
			star--;
			space++;
		}
		else 
		{
			star++;
			space--;
		}
	}
	
}
}
