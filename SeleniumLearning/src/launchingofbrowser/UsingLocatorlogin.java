package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorlogin {
	
	public static void main(String[] agrs) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtboxusername = driver.findElement(By.id("txtUsername"));
		txtboxusername.sendKeys("Admin");
		
		WebElement txtboxpassword = driver.findElement(By.id("txtPassword"));
		txtboxpassword.sendKeys("admin123");
		
		WebElement bttnlogin = driver.findElement(By.id("btnLogin"));
		bttnlogin.click();
		
		WebElement dropdown = driver.findElement(By.id("welcome"));
		dropdown.click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
