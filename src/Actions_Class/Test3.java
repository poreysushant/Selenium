package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{
	public static void main(String[] args) 
	{
		//step-1:Set path of chromedriver.exe file
				//parameter-1:Name of the browser
				//Parameter-2:Path of chromedriver.exe file
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("https://www.flipkart.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//close pop-up
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				
				//Step-1:Identify cart and store into an object
				WebElement Cart=driver.findElement(By.xpath("//span[text()='Cart']"));
				
				//Create object of Action Class
				Actions act=new Actions(driver);
				
				//To perform left click operation
				act.click(Cart).perform();
				
		
	}

}
