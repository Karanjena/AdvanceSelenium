package GeneriUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {

	public static String fetchData(String sheet,int row,int cell) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("./textData/textData.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		Row r=s.getRow(row);
		return r.getCell(cell).toString();
	}
	
}
