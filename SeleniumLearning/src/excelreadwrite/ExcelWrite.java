package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		File path = new File("C:\\Selenium\\Velocity.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream input = new FileOutputStream(path);
		sheet1.createRow(0).createCell(0).setCellValue("Ajay");
		sheet1.getRow(0).createCell(1).setCellValue("Sharad");
		sheet1.getRow(0).createCell(2).setCellValue("Pandurang");
		sheet1.getRow(0).createCell(3).setCellValue("Arti");
		sheet1.getRow(0).createCell(4).setCellValue("Rohit");
		sheet1.getRow(0).createCell(5).setCellValue("Aditya");
		
		workbook.write(input);
				
	}
}
