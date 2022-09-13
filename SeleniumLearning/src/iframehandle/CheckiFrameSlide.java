package iframehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckiFrameSlide {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(1000);
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 400, 0).perform();
		Thread.sleep(3000);
	
		act.dragAndDropBy(slider, -300, 0).perform();
		driver.switchTo().parentFrame();
	}

}
