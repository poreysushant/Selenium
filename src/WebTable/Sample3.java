package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	public static void main(String[] args) 
	{
		//step-1:Set path of chromedriver.exe file
				//parameter-1:Name of the browser
				//Parameter-2:Path of chromedriver.exe file
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
				
		//create object of cromedriver class and provide reference of webdriver interface
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/hp/Desktop/html%20coding/Table1.html");
				
				//Identify table and enter 3rd row and fetch "300"
				
				WebElement S1=driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[3]"));
				
				//To get text of "300"
				String text=S1.getText();
				System.out.println(text);
				
				
				
		
	}	
	
}
