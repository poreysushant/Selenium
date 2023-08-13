package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTestclass_vishal 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
    {

		//To reach upto the excel sheet
FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
	Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet2");


        // Step-I: Set path of chromedriver.exe file
        //Parameter-I: Name of the browser
        //Parameter-II: Path of chromedriver.exe file
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\Desktop\\Selenium\\updated crome browser\\chromedriver_win32 (1)\\chromedriver.exe"); 	  

       //Create object of chromedriver class and provide reference of  Webdriver interface             
          WebDriver driver=new ChromeDriver();
 

  driver.get("https://kite.zerodha.com/");
  
  driver.manage().window().maximize();
          
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  

  //create object of POM class1
  kiteloginpage1_vishal login1=new kiteloginpage1_vishal(driver);
  
  //Fetch UserID from Excelsheet 
  String  UIDInfo=Sh.getRow(0).getCell(0).getStringCellValue();
  login1.enterUserID(UIDInfo); 

  //Fetch Password from Excelsheet  
  String  PswInfo=Sh.getRow(0).getCell(1).getStringCellValue(); 
  login1.enterpassword(PswInfo);
  login1.clickloginbtn();
  

  //create object of POM class2    
  kiteloginpage2_vishal Login2=new kiteloginpage2_vishal(driver);
  
  //Fetch PIN from Excelsheet
  String  PINInfo=Sh.getRow(0).getCell(2).getStringCellValue(); 
  Login2.enterPIN(PINInfo);//449192   
  Login2.clickbtn();
  
  
  //create object of POM class3
  kiteHomePage_vishal Home=new kiteHomePage_vishal(driver);
  
  //Fetch Expected UserID
  String  UserIDInfo=Sh.getRow(0).getCell(3).getStringCellValue(); 
  Home.verifyUserID(UserIDInfo);
  
  // Close Browser
  Thread.sleep(5000);
  driver.close();
  
}


	  

	  
	  
	  
	  
	  
	  
	  
	  
}


