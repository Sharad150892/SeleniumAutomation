package iframehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDragandDrop {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(1000);
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act = new Actions(driver);
			
		act.clickAndHold(sourceElement).perform();
		act.moveToElement(targetElement).release().build().perform();
				
	}

}
