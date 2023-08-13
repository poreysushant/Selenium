package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		//step-1:Set path of chromedriver.exe file
		//parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver\\chromedriver.exe");
		
	//create object of cromedriver class and provide reference of webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//To reach to excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		//Enter User ID
		String UserID=Sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UserID);
		
		Thread.sleep(1000);
		
		//Enter PSW
		String Password=Sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
		Thread.sleep(1000);
		
		//Click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		Thread.sleep(1000);
		
		//Enter Pin
		String PIN=Sh.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
		//Click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//Verify UserID
		
		String ExpectedUserID=Sh.getRow(0).getCell(3).getStringCellValue();
		
		//get the userID
		
		String ActUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		if(ExpectedUserID.equals(ActUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		

		
		
	}
}


