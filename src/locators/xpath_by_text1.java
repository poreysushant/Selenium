package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text1 
{
	public static void main(String[] args) throws InterruptedException
{

		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//enter UN
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("xyz");
		
		//wait
		Thread.sleep(1000);
		
		//enter password
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("abc");
		
		//click on login button
		driver.findElement(By.xpath("//button[text()='login']")).click();
			
		
	}

}
