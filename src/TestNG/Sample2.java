package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 
{

	@Test
	public void TC3()            //Test method/Test case
	{
		Reporter.log("running TC3", true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("running TC4", true);
	}

}



