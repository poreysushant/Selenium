package Open_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\seleniun2\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	}

}
