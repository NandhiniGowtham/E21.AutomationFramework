package genericUtilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of all generic methods related to File operations
 * @author Nandhini V
 *
 */
public class FileUtility {

	/**
	 * This method will read data from property file and return the value to caller
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		String path = "E:\\QSPIDERSUB\\DDT\\E21Data.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
	/**
	 * This method will read String Data from the given row and cell and return 
	 * the value to Caller
	 * @param sheetName
	 * @param rowNo
	 * @param celNo
	 * @return Value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheetName, int rowNo, int celNo) throws EncryptedDocumentException, IOException
	{
	String path ="C:\\Users\\Rajeshkumar V\\eclipse-workspace\\E21AutomationFramework\\data\\E21Data.xlsx";
		FileInputStream fiss = new FileInputStream(path);
				//("C:\\Users\\Rajeshkumar V\\eclipse-workspace\\E21AutomationFramework\\data\\E21Data.xlsx");
		Workbook wb = WorkbookFactory.create(fiss);
		String value = wb.getSheet(sheetName).getRow(rowNo).getCell(celNo).getStringCellValue();
	    return value;
	
	}
	
	
	/**
	 * This method will read numeric data from the excel File
	 * @param sheetName
	 * @param rowNo
	 * @param celNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readNumericDataFromExcel(String sheetName, int rowNo, int celNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("‪C:\\Users\\Rajeshkumar V\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double numValue = wb.getSheet(sheetName).getRow(rowNo).getCell(celNo).getNumericCellValue();
	    return numValue;
	}
}
