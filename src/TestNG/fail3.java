package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail3 
{
	@Test
	public void TC1()       //Test method/test case
	{
		Reporter.log("running TC1", true);
		
	}
	
	@Test
	public void TC2()
	{
		Assert.fail();
		Reporter.log("running TC2", true);
	}
	
	@Test
	public void TC3()
	{
		//Assert.fail();
		Reporter.log("running TC3", true);
	}
	


}
