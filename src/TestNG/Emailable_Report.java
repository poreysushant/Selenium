package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test
	public void m1()                //Test method/Test case
	{
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
		Reporter.log("running method m3", false);
	}
	
	@Test
	public void m4()
	{
		Reporter.log("running method m4");
	}
	
	@Test
	public void m5()
	{
		System.out.println("Running method m5");
	}

}
