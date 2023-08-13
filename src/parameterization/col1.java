package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class col1 
{
	//To fetch all the data of single cell
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		//To get last row index
		int lastrowindex=Sh.getLastRowNum();
		
		//Take for loop for Row
		
		//i=0 0<=3
		
		for(int i=0; i<=lastrowindex;i++)
			           //3
		{
			String value=Sh.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value); 
			
		}
		
	}

}
