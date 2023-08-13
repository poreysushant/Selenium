package POM_DDF_Testing_BaseClass_UtilityClass;

import java.io.IOException;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTestClass extends Base_class
{
	kiteloginpage1 login1;
	kiteloginpage2 Login2;
	kiteHomePage Home;
	
	@BeforeClass
	public void OpenBrowser()
	{
		//open Browser
		initilizeBrowser();
		//create object of POM class2
		login1=new kiteloginpage1(driver);
		
		
		//create object of POM class2
		Login2=new kiteloginpage2(driver);
		
		//create object of POM class3
		Home=new kiteHomePage(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		//Enter UN
		login1.enterUserID(UtilityClass.getDataFromPF("UN"));  //GP8097
		
		Thread.sleep(1000);
		
		//Enter PSW
		login1.enterpassword(UtilityClass.getDataFromPF("PSW"));   //Swami@0110
		
		//Click login button
		login1.clickloginbtn();
		
		Thread.sleep(2000);
		
		//Enter PIN
		  Login2.enterPIN(UtilityClass.getDataFromPF("PIN")); //449192
		
		//Click Ctn Button
		Login2.clickctnbtn();
		
	}
	
	     @Test
	     public void VerifyUserID()
	     {
	    	 String ActualUserID=Home.getkiteHomePageUserID();    //GP8097
	    	 
	    	 String ExpecteduserID=Home.getkiteHomePageUserID();  //GP8097
	    	 
	    	 Assert.assertEquals(ActualUserID, ExpecteduserID,"Failed:Both are different");
	    	 
	     }
	     
	     @AfterMethod
	     public void logoutFromApplication(ITestResult Result) throws IOException
	     {
	    	 if(Result.getStatus()==ITestResult.FAILURE)    //Fail==Fail
	    	 {
	    		 UtilityClass.Screenshot(driver);
	    	 }
	    	 
	    	 Home.clickuserID();
	    	 Home.clicklogoutbtn();
	     }
	     
	     @AfterClass
	     public void CloseBrowser()
	     {
	    	 driver.close();
	     }
	
	
	
	}
