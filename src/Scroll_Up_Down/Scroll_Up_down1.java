package Scroll_Up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_down1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
	
	// Launch the application		
    driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

	
	driver.manage().window().maximize();
	
	//Wait 2 sec
	Thread.sleep(2000);
	
	//Scroll Down:Enter 2nd parameter's +ve pixel value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	
	//Wait 2 sec
	Thread.sleep(5000);
	
	//Scroll up:Enter 2nd parameter's -ve pixel value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
	
	
}



}
