package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert5 
{

	@Test
	public void assertnull()                 //Test method/Test case
	{
		String str=null;
		
		Assert.assertNull(str);       
	}
	

	@Test
	public void assertnull1()                 //Test method/Test case
	{
		String str="abcd";
		
		Assert.assertNull(str);       
	}
	

}
