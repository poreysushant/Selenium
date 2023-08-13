package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class approch1 
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
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abc");
		
		//wait
		Thread.sleep(2000);
		
		//clear UN
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		
		//wait
		Thread.sleep(2000);
		
		//Enter UN
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("xyz");
		
	}

}
