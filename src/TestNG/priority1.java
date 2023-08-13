package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority1 
{
	@Test(priority=2)
	public void TC1()          //Test method/Test case
	{
		Reporter.log("running TC1", true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}

}
