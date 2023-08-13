package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up1 
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
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		
		//wait
		Thread.sleep(2000);
		
		//enter customer Id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//shift to alert pop-up
		Alert alt=driver.switchTo().alert();
				
		//wait
		Thread.sleep(2000);
				
		//click on ok button
		alt.accept();
		
	
	}

}
