package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TC1 
{
	@Test(groups="Login")
	
	public void TC1()         //Test method/Test case
	{
		Reporter.log("running TC1", true);
	}
	
    @Test(groups="Login")
	
	public void TC2()         //Test method/Test case
	{
		Reporter.log("running TC2", true);
	}
    
    
    @Test(groups="Profile")
	
	public void TC3()         //Test method/Test case
	{
		Reporter.log("running TC3", true);
	}
    
    @Test(groups="Profile")
	
	public void TC4()         //Test method/Test case
	{
		Reporter.log("running TC4", true);
	}
    
    @Test(groups="Order")
	
	public void TC5()         //Test method/Test case
	{
		Reporter.log("running TC5", true);
	}
    
     @Test(groups="Fund")
	
	public void TC6()         //Test method/Test case
	{
		Reporter.log("running TC6", true);
	}






}
