package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 
{
	@Test
	public void openFacebookApp() throws InterruptedException                                  //Test method/Test case
	{

	//step-1:Set path of chromedriver.exe file
	//parameter-1:Name of the browser
	//Parameter-2:Path of chromedriver.exe file
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
	
//create object of cromedriver class and provide reference of webdriver interface
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.close();
	
	


}
}
