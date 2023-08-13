package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 
{
	@Test
	public void assertequals()                   //Test method/Test case
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed:Actual and expected result are different");	
	}
	
	@Test
	public void assertequal1()
	{
		String ActualResult="Hello";
		String ExpectedResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed:Actual and expected result are different");
	}
}


