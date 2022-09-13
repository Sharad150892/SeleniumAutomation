package scrollingmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckScrollBy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".textInputContainer input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector(".textInputContainer input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-700)");
	}

}
