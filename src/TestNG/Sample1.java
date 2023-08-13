package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test
	public void TC1()            //Test method/Test case
	{
		Reporter.log("running TC1", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}

}
