package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{

	@Test
	public void TC5()            //Test method/Test case
	{
		Reporter.log("running TC5", true);
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("running TC6", true);
	}

}



