package actionhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckCopyCutPaste {
	
	static WebDriver driver;
	public static void main(String[] ars) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		driver.manage().window().maximize();
		
		WebElement sourceElement = driver.findElement(By.xpath("//input[@name='enter-name']"));
		WebElement targetElement = driver.findElement(By.xpath("//input[@name='show-hide']"));
		WebElement newtargetElement = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		Actions act = new Actions(driver);
		act.sendKeys(sourceElement,"Sharad").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(1000);
		targetElement.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(4000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		newtargetElement.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
