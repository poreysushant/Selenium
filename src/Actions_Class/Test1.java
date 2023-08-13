package Actions_Class;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{


		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
//		System.setProperty("webdriver.chrome.driver",
//				"G:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver\\chromedriver.exe");
//		
//create object of cromedriver class and provide reference of webdriver interface
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);		
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Step-1:Identify dropdown and store into an object
	WebElement Dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	
	//Create object of Action class
	Actions act=new Actions(driver);
	
	//To move curser
	act.moveToElement(Dropdown).perform();
	
	Thread.sleep(1000);
	
	//To click windows option
	driver.findElement(By.xpath("//a[text()='Windows']")).click();
	
		
	}

}
