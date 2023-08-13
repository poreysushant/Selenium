package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method1 
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
				
				//To enter URL on the browser/To open an application
				driver.navigate().to("https://www.flipkart.com/");
				
				//wait
				Thread.sleep(2000);
				
				//To enter URL on the browser/To open an application
				driver.navigate().to("https://www.google.com/");
				
				//wait
				Thread.sleep(2000);
				//to move forward
				driver.navigate().back();
				
				//wait
				Thread.sleep(2000);
				//to move forward
				driver.navigate().forward();
				
				//wait
				Thread.sleep(2000);
				//to move forward
				driver.navigate().refresh();
				
				//wait
				Thread.sleep(2000);
				//to close browser
				driver.close();
				
				
		
	}
	

}
