package calenderhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapCalender {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();

		Thread.sleep(1000);

		int i = 0;
		while (i == 0) {
			String monthyear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			if (!(monthyear.equals("March 2024")))
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			else
				break;
		}
		List<WebElement> day = driver.findElements(By.xpath("//tbody//tr//td//a"));
		for (WebElement days : day)
			if (days.getText().equals("14"))
				days.click();
	}
}
