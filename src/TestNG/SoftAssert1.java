package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 
{
	@Test
	public void TC()           //Test method/Test case
	{
		String Str1="Hi";
		String Str2="Hello";
		String Str3="Good Morning";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(Str1, Str2, "Both result are different");    //fail
		soft.assertEquals(Str2, Str3, "Both result are different");   //fail
		soft.assertNotEquals(Str1, Str2, "Both result are same");      //pass
		
		soft.assertAll();
	

}
}
