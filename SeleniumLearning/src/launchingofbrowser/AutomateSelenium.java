 package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSelenium {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='react-burger-cross-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
			
	}

}
