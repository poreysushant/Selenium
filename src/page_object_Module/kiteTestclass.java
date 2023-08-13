package page_object_Module;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTestclass 
{

    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	  {
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");  	  
		
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		    driver.get("https://kite.zerodha.com/");
		    
		    driver.manage().window().maximize();
		            
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    //create object of POM class1
		    kiteloginpage1 login1=new kiteloginpage1(driver);
		    login1.enterUserID();
		    login1.enterpassword();
		    login1.clickloginbtn();
	    
		    //create object of POM class2    
		    kiteloginpage2 Login2=new kiteloginpage2(driver);
		    Login2.enterPIN();
		    Login2.clickctnbtn();
		    
		    
		    //create object of POM class3
		    kiteHomePage Home=new kiteHomePage(driver);
		    Home.verifyUserID();
		    

		    Thread.sleep(5000);
		    
		    driver.close();
		    
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
