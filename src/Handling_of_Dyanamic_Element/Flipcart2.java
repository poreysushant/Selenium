package Handling_of_Dyanamic_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver\\chromedriver.exe\\");
		
//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//close pop-up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		//Enter data
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus mobile");
		
		//Click on search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//Identify rating element
		String Rating=driver.findElement(By.xpath("//div[@class='col col-7-12'][1])")).getText();
		
		System.out.println(Rating);
		
		
	}

		
	}


