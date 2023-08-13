package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword3 
{
	@Test(timeOut=5000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("running method m1", true);
	}
	
	@Test
	public void m2() 
	{
		Reporter.log("running method m2", true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("running method m3", true);
	}

}
