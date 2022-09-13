package excelreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtilityFramework {

	static String path = "C:\\Selenium\\Velocity.xlsx";

	public String ExcelReading(int sheetNo, int rownumbwr, int columnnumber) throws IOException {
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		return sheet.getRow(rownumbwr).getCell(columnnumber).getStringCellValue();
	}

	public void ExcelWriting(int rownumbwr, int columnnumber, int sheetNo, String data) throws IOException {
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		FileOutputStream input = new FileOutputStream(path);
		sheet.createRow(rownumbwr).createCell(columnnumber).setCellValue(data);
		workbook.write(input);
		workbook.close();
	}

}
