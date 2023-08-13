package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Right_Left1 
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
	
		// Identify element upto we have to scroll
		 WebElement Element = driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
		 
		      //To Scroll Horizontally
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);

       

       	
      
	
	}
		
	}


