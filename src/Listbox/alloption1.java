package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloption1 
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
				
			
				
				driver.get("file:///C:/Users/hp/Desktop/html%20coding/multiselectablelistbox1.html");
				
				//step-1:Identify listbox and store into an object
				WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
				
				//step-2:Create object of select class
				Select S1=new Select(Country);
				
				//step-3:Call the method
				S1.selectByVisibleText("Ind");
				S1.selectByVisibleText("Pak");
				S1.selectByIndex(2);
				S1.selectByIndex(3);
				
				//To get all selected options of listbox
				List<WebElement>alloptions=S1.getAllSelectedOptions();
				
				for(WebElement S2:alloptions)
				{
					System.out.println(S2.getText());
				}

	}

}
