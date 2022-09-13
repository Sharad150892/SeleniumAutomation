package excelreadwrite;

import java.io.IOException;

public class ExcelExecution {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ExcelReadWriteUtilityFramework obj = new ExcelReadWriteUtilityFramework();
		obj.ExcelWriting(0, 0, 0, "Automation");
		Thread.sleep(2000);
		System.out.println(obj.ExcelReading(0, 0, 0));
		
	}
}
