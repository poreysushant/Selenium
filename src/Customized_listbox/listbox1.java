package Customized_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listbox1 
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
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify create new account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		
		//Step-1:Identify listbox and store it into an object
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step-2:Create object of Action Class
		Actions act=new Actions(driver);
		
		//To perform left click opearation
		act.click(Month).perform();
		
		//Navigate to the bottom by using END key
		act.sendKeys(Keys.END).perform();
		
		Thread.sleep(1000);
		
		for(int i=1; i<=2; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		Thread.sleep(1000);
		
		//To select option
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
