package scrollingmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollParticularElement {
	
	static WebDriver driver;
	public void ScreenShot() throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot) driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shara\\OneDrive\\Pictures\\Screenshots\\ScreenShot7may.png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".textInputContainer input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector(".textInputContainer input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		Thread.sleep(4000);
		ScrollParticularElement obj = new ScrollParticularElement();
		obj.ScreenShot();
		
		WebElement checkboxneedtocheck = driver.findElement(By.xpath("//*[text()='John.Smith']//ancestor::tr//input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",checkboxneedtocheck);
		Thread.sleep(3000);
		checkboxneedtocheck.click();
		
		
	}

}
