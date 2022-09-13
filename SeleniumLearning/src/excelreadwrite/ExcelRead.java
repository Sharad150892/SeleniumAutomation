package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		//get path excel
		File path = new File("C:\\Selenium\\Velocity.xlsx");
		
		//load excel file
		FileInputStream load = new FileInputStream(path);
		
		//workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook 
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		//read cell
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
		String data3 = sheet1.getRow(2).getCell(0).getStringCellValue();
		String data4 = sheet1.getRow(3).getCell(0).getStringCellValue();
		String data5 = sheet1.getRow(4).getCell(0).getStringCellValue();
		String data6 = sheet1.getRow(5).getCell(0).getStringCellValue();
		
		System.out.println(data1+", "+data2+", "+data3+", "+data4+", "+data5+", "+data6);
		
	}
	
}
