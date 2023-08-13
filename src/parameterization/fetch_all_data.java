package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_all_data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
		//find last row index
		int lastrowindex=Sh.getLastRowNum();
		
		//Outer for loop for row
		for(int i=0; i<=lastrowindex; i++)
		{
			int Lastcellindex=Sh.getRow(i).getLastCellNum()-1;
			
			//inner for loop for cell
			for(int a=0; a<=Lastcellindex; a++)
				
			{
				//fetch all the data
				String value=Sh.getRow(i).getCell(a).getStringCellValue();
				
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
		
	}

}
