package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("#signup_button_area input")).click();
		
		Thread.sleep(3000);
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:days)
			if(day.getText().equals("15"))
				day.click();
		
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
			if(month.getText().equalsIgnoreCase("Aug"))
				month.click();
		
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
			if(year.getText().equals("1992"))
				year.click();
	}

}
