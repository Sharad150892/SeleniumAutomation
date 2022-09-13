package calenderhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalCalender {

	static WebDriver driver;

	public void selectYearFromPast20yearSelection(String yearInput) {
		List<WebElement> pastyears = driver.findElements(By.xpath("//*[@title='Change the year']//option"));
		pastyears.get(0).click();
		yearSelection(yearInput);
	}

	public void yearSelection(String yearInput) {
		WebElement yearselect = driver.findElement(By.xpath("//*[@title='Change the year']"));
		Select selyear = new Select(yearselect);
		selyear.selectByVisibleText(yearInput);
	}
	
	public void monthSelection(String monthInput) {
		WebElement monthselect = driver.findElement(By.xpath("//*[@title='Change the month']"));
		Select selmonth = new Select(monthselect);
		selmonth.selectByVisibleText(monthInput);
	}
	
	public void dateSelection(String dateInput) {
		List<WebElement> dates = driver.findElements(By.xpath("//table//tbody//tr/td/a"));
		for(WebElement date:dates)
			if(date.getText().equals(dateInput))
				date.click();
	}
	
	public void selectCalender2() {
		driver.findElement(By.id("datepicker2")).click();
	}
	
	public void selectDateFromDatePicker2(String year, String month, String date) throws InterruptedException {
		selectCalender2();
		Thread.sleep(2000);
		selectYearFromPast20yearSelection(year);
		monthSelection(month);
		dateSelection(date);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		NormalCalender y = new NormalCalender();
		y.selectDateFromDatePicker2("1992","August","15");
	}

}
