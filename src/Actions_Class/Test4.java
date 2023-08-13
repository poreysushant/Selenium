package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test4 
{
	public static void main(String[] args) 
	{

		//step-1:Set path of chromedriver.exe file
				//parameter-1:Name of the browser
				//Parameter-2:Path of chromedriver.exe file
				
				System.setProperty("webdriver.chrome.driver",
						"G:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver\\chromedriver.exe");
				
		//create object of cromedriver class and provide reference of webdriver interface
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//Step-1: Identify button and store into an object
				WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
						
				//Step-2:Create object of Action Class
						Actions act=new Actions(driver);
				
				//To perform double click operation
				act.doubleClick(button).perform();
				
		
	}

}
