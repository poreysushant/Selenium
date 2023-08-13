package Open_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser1 
{
	public static void main(String[] args) 
	{
		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//create object of chromedriver class
		ChromeDriver driver=new ChromeDriver();   //classname objectname=new classname();
		
	}

}
