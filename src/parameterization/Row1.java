package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

     //To fetch all the data of single row
public class Row1 
{
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet5");
		
		//find index of cell
		
		int lastcellindex=Sh.getRow(0).getLastCellNum()-1;
		
		//Take a for loop for cell
		//i=0  0<=5
		
		for(int i=0; i<=lastcellindex; i++)
		                 //5
		{
			String value=Sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value+ " ");  
		}
	}

}
