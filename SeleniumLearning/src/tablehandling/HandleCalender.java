package tablehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {
	
	static WebDriver driver;
	
	public void monthyears(String month) {
		int i = 0;
		while (i==0) {
			String months = driver.findElement(By.xpath("//*[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			if (!(months.equals(month)))
				driver.findElement(By.xpath("//*[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			else
				break;
		}
		
		
	}
	
	public void SelectJourneyDate(String dateinput) {
		List<WebElement> day = driver.findElements(By.xpath("//tbody//tr//td//a"));
		for(WebElement date:day)
			if(date.getText().equals(dateinput))
				date.click();
	}
	public void selectcalender() {
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.findElement(By.xpath("//*[@id='jDate']//input")).click();
	}
	
	public void SelectDateFromCalender(String month, String date) throws InterruptedException {
		selectcalender();
		Thread.sleep(1000);
		monthyears(month);
		Thread.sleep(1000);
		SelectJourneyDate(date);
	}
		
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(500);
		HandleCalender c = new HandleCalender();
		c.SelectDateFromCalender("November","23");
	}

}
