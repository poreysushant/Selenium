package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 
{
	//To fetch Numeric type data
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		double value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(value);
		
		
	}

}
