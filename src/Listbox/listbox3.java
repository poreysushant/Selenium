package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 
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
		
		//click on create new account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//step-1:Identify listbox and store into an object
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step-2:Create object of select class
		Select S=new Select(Month);
		
		//step-3:Call the method
		S.selectByIndex(7);
		

		
	}

}
