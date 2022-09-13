package checkboxautomate;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectParticularCheckBox {
	static WebDriver driver;
	public void ScreenShot() throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot) driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shara\\OneDrive\\Pictures\\Screenshots\\ScreenShot7may.png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@title='Toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@for='tree-node-desktop']//ancestor::span//button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//*[text()='Commands']//ancestor::label//span[@class='rct-checkbox']//*[@class='rct-icon rct-icon-uncheck']"))
				.click();
		
		SelectParticularCheckBox obj = new SelectParticularCheckBox();
		obj.ScreenShot();
	}
}
