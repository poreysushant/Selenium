package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class approch2 
{
	public static void main(String[] args) throws InterruptedException 
	{

		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
		
//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
			//enter UN
		WebElement UN=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		//Enter UN
		UN.sendKeys("abc");
		
		//wait
		Thread.sleep(2000);
		
		//clear UN
		UN.clear();
		
		//wait
		Thread.sleep(2000);
		
		//Enter UN
		UN.sendKeys("xyz");
		
		
	}

}
