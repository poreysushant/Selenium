package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert3 
{
	@Test
	public void assertTrue()                 //Test method/Test case
	{
		boolean ActualResult=true;
		
		Assert.assertTrue(ActualResult);        //Pass
	}
	
	
	@Test
	public void assertTrue1()                 //Test method/Test case
	{
		boolean ActualResult=false;
		
		Assert.assertTrue(ActualResult);        
	}
	
}
