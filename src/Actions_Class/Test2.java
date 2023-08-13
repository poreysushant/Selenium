package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test2 
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
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//close pop-up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//Step-1:Identify cart and store into an object
		WebElement Cart=driver.findElement(By.xpath("//span[text()='Cart']"));
		
		//Create object of Action Class
		Actions act=new Actions(driver);
		
		//To perform right click operation
		act.contextClick(Cart).perform();
		
	}

}
