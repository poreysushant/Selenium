package Star_Pattern;

public class Star14 
{
	 //   *
	//   * *
	//  * * *
	// * * * *
	//  * * *
	//   * *
	//    *
	
	public static void main(String[] args) 
	{
		int star=1; //0
		int space=3; //4
		        
		       //i=1    1<=7     2
		              //2<=7     3
		              //3<=7     4
		              //4<=7     5
		               //5<=7    6
		               //6<=7    7
		               //7<=7    8
		               //8<=7
		for(int i=1;    i<=7;   i++)
		{
			      
			for(int a=1;   a<=space;  a++)
			{
				System.out.print(" ");
			}
			  
			for(int b=1; b<=star; b++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
			if(i<=3)  //7<=3
			{
				star++;
				space--;
			}
			else 
			{
				star--;
				space++;
			}
			                        //    *
			                        //   * * 
			                        //  * * *
			                        // * * * *
			                       //   * * *
			                       //    * *
			                       //     *
			                       //
			
		}
		
		
		
		
	}
	













}
