package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readexceldata {
	static Workbook book;
	static Sheet sheet;

	
	public static void readexcel(String path, String SheetName) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file = new FileInputStream(path);
			
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(SheetName);
		
			}
	
	public static String getData(int rownum, int colnum)
	{
		String data =sheet.getRow(rownum).getCell(colnum).toString();
		return data;
	}
}
