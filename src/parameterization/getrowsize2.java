package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsize2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excel sheet
		
			FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
			
			int size=WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
			
			System.out.println(size);
				
		
	}

}
