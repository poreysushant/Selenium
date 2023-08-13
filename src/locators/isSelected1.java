package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected1 
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
		
		//wait 2 sec
		Thread.sleep(2000);
		
		//verify radio button is selected or not 
		
		boolean result=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		
		System.out.println(result);
		
	
		
	}

}
