package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
		
//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	//switch to frame
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
	
	//Identify text field and enter information
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
	
	Thread.sleep(1000);
	
	//To switch to main page
	driver.switchTo().defaultContent();
	
	//click on Home
	driver.findElement(By.xpath("//a[text()='Home']")).click();
	

		
	}

}
