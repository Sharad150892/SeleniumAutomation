package checkboxautomate;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {
	
	static WebDriver driver;
	public void ScreenShot() throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot) driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shara\\OneDrive\\Pictures\\Screenshots\\ScreenShot7may.png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[text()='Admin']//parent::a")).click();
		Thread.sleep(500);
		List<WebElement> chkbox = driver.findElements(By.xpath("//*[text()='adash']//ancestor::tbody//child::input"));		
		for(WebElement checkbox:chkbox) {
			checkbox.click();
		}
		SelectAllCheckbox obj = new SelectAllCheckbox();
		obj.ScreenShot();
	}

}
