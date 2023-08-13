package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Disadvt_of_Assert 
{
	@Test
	public void TC1()                   //Test method/Test case
	{
		String Actual="Hi";
		String Expected="Hi";
		
		Assert.assertNotEquals(Actual, Expected, "Failed:Actual and expected result are same");	 //fail
		
		Assert.assertEquals(Actual, Expected,"Failed:Actual and expected result are different");
		
		
	}
	

}
