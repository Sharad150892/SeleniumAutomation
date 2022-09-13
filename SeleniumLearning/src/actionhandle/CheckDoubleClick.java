package actionhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckDoubleClick {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		driver.manage().window().maximize();
		WebElement target1= driver.findElement(By.xpath("//input[@value='option1']"));
		WebElement target2= driver.findElement(By.xpath("//input[@value='option2']"));
		WebElement target3= driver.findElement(By.xpath("//input[@value='option3']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",target1);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(target1).perform();
		Thread.sleep(2000);
		act.doubleClick(target2).perform();
		Thread.sleep(2000);
		act.doubleClick(target3).perform();
		Thread.sleep(2000);
	}
}
