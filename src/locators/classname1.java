package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname1 
{
	public static void main(String[] args) 
	{

		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
		"G:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("file:///C:/Users/hp/Desktop/html%20coding/classname.html");
	
	driver.manage().window().maximize();
	
	//Enter UN
	driver.findElement(By.className("xyz123")).sendKeys("abc");
	
	//Enter Password
	driver.findElement(By.className("xyz456")).sendKeys("xyz");
		

		
	}

}
