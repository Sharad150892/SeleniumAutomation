package actionhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckHoverMouse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		
		WebElement hoverelement = driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));
		WebElement hoverelement1 = driver.findElement(By.cssSelector("#menu_admin_viewAdminModule"));
		WebElement hoverelement2 = driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(hoverelement).perform();
		Thread.sleep(2000);
		act.moveToElement(hoverelement1).perform();
		Thread.sleep(2000);
		act.moveToElement(hoverelement2).perform();
		
	}

}
