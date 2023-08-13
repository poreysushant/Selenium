package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 
  {
   public static void main(String[] args) throws IOException 
  
  {
	   //To reach upto excel sheet
	   FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\New Microsoft Office Excel Worksheet.xlsx");
	   
	   //To open excel sheet
	   Workbook book=WorkbookFactory.create(file);
	   
	   //To enter particular sheet
	   Sheet Sh=book.getSheet("Sheet1");
	   
	   //To highlight row of excel sheet
	   Row S1=Sh.getRow(0);
	   
	   //To highlight cell/column of excel sheet
	   Cell S2=S1.getCell(0);
	   
	   //To fetch information
	   String value=S2.getStringCellValue();
	   
	   System.out.println(value);
	   
	   
	   
	
}

}
