package POM_DDF_Testing_BaseClass_UtilityClass;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//PIN
	public static String getDataFromPF(String key) throws IOException

	{
		//Create object of finalinputstram class and pass path of the property file
		
		//To reach upto property file
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\12th_feb_selenium\\propertFile.properties");
		
		//create object of properties class
		Properties prop=new Properties();
		
		//To open property file
		prop.load(file);
		
		//To fetch data from property file
		String value1=prop.getProperty(key);   //PIN
		
		return value1;                         //449192
	}
	
	     //To fetch data from Excel Sheet
	
	  public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	  
	  {
		  //To reach upto excel sheet
		  FileInputStream file=new FileInputStream("C:\\Usershp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		  
		  //To open excel sheet
		  Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet3");
		  
		  String Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		  return Value2;   //GP8097
		  
			
	  }
	  
	  //To capture Screenshot
	  
	  public static void Screenshot(WebDriver driver) throws IOException
	  {
		  File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File Destination=new File("C:\\Users\\hp\\Desktop\\Selenium\\screenshot\\sample6.jpg");
		  
		  FileHandler.copy(Source, Destination);
		
	
	
	
	
	
	
	}
	
	}


