package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

//To fetch string type data

public class Sample3 
{
	public static void main(String[] args) throws IOException 
	{
		//To reach upto excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		//To reach upto excel sheet
		String value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		
		
	
		
		
		
		
	
	 
	}
	
	
	
	
	
	

}
