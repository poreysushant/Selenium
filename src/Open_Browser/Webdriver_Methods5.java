package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods5
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
				
				//To enter URL on the browser/To open an application
				driver.get("https://www.flipkart.com/");
				
				//To get the title of webpage
				String Title1=driver.getTitle();
				System.out.println(Title1);
				
		
	}

}
