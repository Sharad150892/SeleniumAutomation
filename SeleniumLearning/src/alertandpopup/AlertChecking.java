package alertandpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertChecking {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("ABCD");
		driver.switchTo().alert().accept();
		
	}
	

}
