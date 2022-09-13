package launchingofbrowser;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock {
	
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(source).perform();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[text()='Your Orders']")).click();		
	}
}
