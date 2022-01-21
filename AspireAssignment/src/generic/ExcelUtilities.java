package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Pawan
 *
 */
public class ExcelUtilities 
{
	static final String filePath=".\\testdata\\aspire.xlsx";
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return 
	 */
   public static String readData(String sheetName, int rowNum, int cellNum) throws InvalidFormatException 
   {
	   
   String value="";
	   try
	   {
		   
	Workbook wb = WorkbookFactory.create(new FileInputStream(new File(filePath)));
    value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	   }
	   catch(EncryptedDocumentException | IOException e){
		   e.printStackTrace();
	   }
	   
	return value;
}
}
