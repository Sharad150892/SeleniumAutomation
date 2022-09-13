package waithandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckImplicitWait {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		int i = 1;
		while(i>0) {
			driver.findElement(By.xpath("//*[@id='q']//input["+i+"]")).click();
			i++;
		}
	}
}
