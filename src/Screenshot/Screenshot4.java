package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 
{
	public static void main(String[] args) throws IOException 
	{

		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
		
//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the browser/To open an application
		
		driver.get("https://www.instagram.com/?hl=en");
		
		//Take screenshot
	
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Src);
		
		//create object of file
				File dest=new File("C:\\Users\\hp\\Desktop\\Selenium\\screenshot\\Sample4.png");
				
	    //Copy screenshot to destination folder
				FileHandler.copy(Src, dest);
				
		
		
	}

}
