package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClassMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@title='Change the year']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@title='Change the year']//child::option[1]")).click();
		Thread.sleep(500);
		WebElement years = driver.findElement(By.xpath("//*[@title='Change the year']"));
		years.click();
		Thread.sleep(500);
		Select selyear = new Select(years);
		selyear.selectByVisibleText("1992");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//*[@title='Change the month']"));
		month.click();
		Thread.sleep(500);
		Select selmonth = new Select(month);
		selmonth.selectByVisibleText("April");
		Thread.sleep(500);
		List<WebElement> day = driver.findElements(By.xpath("//*[text()='1']//ancestor::tbody//td//a"));
		for(WebElement days:day) {
			if(days.getText().equals("22"))
				days.click();
			}
		}
}
