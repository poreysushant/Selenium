package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert6 
{

	@Test
	public void assertNotNull()                 //Test method/Test case
	{
		String str="abcd";
		
		Assert.assertNotNull(str);       
	}
	

	@Test
	public void assertNotNull1()                 //Test method/Test case
	{
		String str=null;
		
		Assert.assertNotNull(str);     
	}

}
