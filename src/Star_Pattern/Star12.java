package Star_Pattern;

public class Star12 
{

	// *
	// * *
	// * * *
	// * * * *             //right pascals triangle
	// * * *
	// * *
	// *
	
	
	public static void main(String[] args) 
	{
		int star=1;//0
		
		    //i=1      1<=7     2
		             //2<=7     3
		             //3<=7     4
		             //4<=7     5
		            //5<=7      6
		            //6<=7      7
		            //7<=7      8
		            //8<=7
		for(int i=1;   i<=7;   i++) 	
		{
			
			    //b=1      1<=1
			for(int b=1;   b<=star; b++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
			if(i<=3)   //7<=3
			{
				star++;
				
			}
			else 
			{
				star--;	
			}
			                 
			        
			            
		}
	}
}
