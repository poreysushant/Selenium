package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority4 
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
	
	
	@Test                //by default priority 0
	public void TC3()
	{
		Reporter.log("running TC3", true);
	}
	
	@Test
	public void TC4()   //by default priority 0
	{
		Reporter.log("running TC4", true);
	}
	
	@Test(priority=1)
	public void TC5()
	{
		Reporter.log("running TC5", true);
	}


}


