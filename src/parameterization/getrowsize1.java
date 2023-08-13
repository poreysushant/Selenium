package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//To get index of row

public class getrowsize1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		int RowIndex=WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
		
		System.out.println(RowIndex);
		
		
		
	}
	

}
