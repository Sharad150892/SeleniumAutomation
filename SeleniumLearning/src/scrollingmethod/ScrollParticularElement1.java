package scrollingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollParticularElement1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement check1 = driver.findElement(By.xpath("//img[@alt='Last Freedom Deals on Oneplus Headsets']"));
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",check1);
		js.executeScript("arguments[0].click();", check1);
	}

}
