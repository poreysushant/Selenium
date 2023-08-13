package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 
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
				
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//Step-1:Identify source element and store into an object
				
				WebElement Source=driver.findElement(By.xpath("//a[text()=' 5000']"));
				
				//Step-1:Identify destination element and store into an object
				
				WebElement Destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
				
				//Step-2: Create object of Action Class
				Actions act=new Actions(driver);
				
				//To perform Drag and Drop Action
				act.dragAndDrop(Source, Destination).perform();
				
				
				
				
				
		
	}

}
