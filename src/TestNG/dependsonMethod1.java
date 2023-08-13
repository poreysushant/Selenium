package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonMethod1 
{
	@Test
	public void login()           //test method/test case
	{
		//Assert.fail();
		Reporter.log("running login TC", true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()           //test method/test case
	{
		Reporter.log("running logout test case", true);
	}
	}


