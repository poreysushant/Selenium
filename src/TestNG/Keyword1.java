package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1 
{
	@Test(invocationCount=10)
	public void m1()          //Test Method/Test Case
	{
		Reporter.log("running method m1", true);
	}

}
