package pop_up;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_pop_up 
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
				
				driver.get("https://skpatro.github.io/demo/links/");
				
				
		//click on new tab button
				
				driver.findElement(By.xpath("//input[@name='NewTab']")).click();
				
		//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Set<String> IDs=driver.getWindowHandles();
				
				ArrayList<String> al=new ArrayList<String>(IDs);
				
				//To get main page ID
				String MainPageID=al.get(0);
				System.out.println(MainPageID);
				
				//To get window pop-up ID
				String ChildwindowID=al.get(1);
				System.out.println(ChildwindowID);
				
		//shift focus of selenium on window pop-up
				driver.switchTo().window(ChildwindowID);
				
		
		//click on training link
				driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
				
		//shift focus on selenium from window pop-up to main page
				driver.switchTo().window(MainPageID);
		
				
	}

}
