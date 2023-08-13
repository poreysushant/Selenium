package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample6 
{
	//To read numeric value as a string
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
	}
	

}
