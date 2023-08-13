package TestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_Testing 
{
	
	@Parameters("browserName")   //Firefox

	
	@Test
	public void TC1(String browserName) throws InterruptedException           //firefox  //Test method/test case
	{

		WebDriver driver=null;
		
		if(browserName.equals("Chrome"))            //firefox=chrome
		
		{
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
			
		//create object of cromedriver class and provide reference of webdriver interface
			
			 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("Firefox"))              //Firefox=Firefox
			
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\hp\\Desktop\\Selenium\\firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			
			 driver=new FirefoxDriver();
			
		}
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Enter User Id
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("GP8097");
		
		Thread.sleep(1000);
		
		//Enter PSW
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Swami@0110");
		
		Thread.sleep(1000);
		
		//Click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		Thread.sleep(1000);
		
		//Enter PIN
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("449192");
		
		Thread.sleep(1000);
		
		//Click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		String ExpUserID="GP8097";
		
		//get the userID
		
		String ActUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		if(ExpUserID.equals(ActUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

		
		
		
		
		
		
		
}

