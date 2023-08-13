package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Test_Class 
{
	@Test
	public void m1()    //Test Method or Test Case
	{
		// Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");  	  
		
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		    driver.get("https://kite.zerodha.com/");
		    
		    driver.manage().window().maximize();
		            
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		
	}
	
	
	
	
	

}
