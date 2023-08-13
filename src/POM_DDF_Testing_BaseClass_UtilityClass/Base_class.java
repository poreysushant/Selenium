package POM_DDF_Testing_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
	public void initilizeBrowser() 
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
		    
	}
	
	
	
	
	
	


}
