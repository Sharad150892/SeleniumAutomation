package scrollingmethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckScrollBy1 {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,4000)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,-3000)");
						
	}
}
