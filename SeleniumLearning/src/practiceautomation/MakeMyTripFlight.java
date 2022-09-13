package practiceautomation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
public class MakeMyTripFlight {
	static WebDriver driver;
	
	public void ScreenShot() throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot) driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shara\\OneDrive\\Pictures\\Screenshots\\ScreenShot7may.png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.className("langCardClose")).click();
		WebElement cityfrom = driver.findElement(By.xpath("//*[@id='fromCity']//ancestor::label"));
		cityfrom.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(cityfrom, "Singapore").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(2000);
		act.sendKeys("Bali").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(2000);
		int i = 0;
		while (i == 0) {
			String monthyear = driver.findElements(By.xpath("//*[@class='DayPicker-Caption']//div")).get(0).getText();
			if (!(monthyear.equalsIgnoreCase("October 2022")))
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			else
				break;
		}
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']//div//p"));
		for (WebElement date : dates) {
			if (date.getText().equals("18")) {
				date.click();
		  }
		}
		MakeMyTripFlight obj = new MakeMyTripFlight();
		obj.ScreenShot();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Search")));
		//WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();  //click action not perform here 
		
		Thread.sleep(1000);
	}

}
