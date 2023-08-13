package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 
{

	@Test
	public void assertNotEquals()                   //Test method/Test case
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult,"Failed:Actual and expected result are same");	
	}
	
	@Test
	public void assertNotEquals1()
	{
		String ActualResult="Hello";
		String ExpectedResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult,"Failed:Actual and expected result are same");
	}
}





