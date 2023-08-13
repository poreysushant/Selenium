package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2 
{
	@Test
	public void m1()      //Test Method/Test Case
	{
		Reporter.log("running method m1", true);
	}
	
	@Test(enabled=false)
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
