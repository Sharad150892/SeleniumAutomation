package waithandle;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CheckFluentWait {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();

		// Selenium 4 fluent wait

		FluentWait wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(7))
								.ignoring(NoSuchElementException.class);
		
		driver.findElement(By.id("alert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}

}
