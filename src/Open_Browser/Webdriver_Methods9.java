package Open_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods9 
{
	public static void main(String[]args)
	{
		//step-1:Set path of chromedriver.exe file
				//parameter-1:Name of the browser
				//Parameter-2:Path of chromedriver.exe file
				
				System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		//create object of cromedriver class and provide reference of webdriver interface
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/");
				
				//To set the size of the browser
				Dimension D1=new Dimension(400,700);
				
				driver.manage().window().setSize(D1);
				
	}

}
