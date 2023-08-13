package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	//step-1:Set path of chromedriver.exe file
	//parameter-1:Name of the browser
	//Parameter-2:Path of chromedriver.exe file
	
	System.setProperty("webdriver.chrome.driver",
			"G:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver\\chromedriver.exe");
	
//create object of cromedriver class and provide reference of webdriver interface
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
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
	
	Thread.sleep(2000);
	driver.close();
	
	

}
}
