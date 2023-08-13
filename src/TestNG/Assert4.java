package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert4 
{

	@Test
	public void assertFalse()                 //Test method/Test case
	{
		boolean ActualResult=false;
		
		Assert.assertFalse(ActualResult);       //Pass
	}
	
	
	@Test
	public void assertFalse1()                 //Test method/Test case
	{
		boolean ActualResult=true;
		
		Assert.assertFalse(ActualResult);      
	}
	

}
