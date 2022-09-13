package launchingofbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingCSSselector {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement ValueCheck = driver.findElement(By.xpath("//*[contains(text(),'LOGI')]"));
		String value = ValueCheck.getText();
		System.out.println(value);
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		boolean flag = driver.findElement(By.cssSelector(".main-menu-first-level-list-item")).getText().contains("Admin");
		System.out.println(flag);
		driver.findElement(By.cssSelector(".firstLevelMenu b")).click();
		driver.findElement(By.cssSelector("#menu_admin_UserManagement")).click();
		List<WebElement> result = driver.findElements(By.cssSelector("#resultTable tbody tr td a"));
		for (WebElement results:result ) {
			if (results.getText().contains("sankar")) {
				driver.findElement(By.xpath("//*[@id='resultTable']//tr//a[text()='sankar']//ancestor::tr//input")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='resultTable']//tr//a[text()='sankar']")).click();
			}
		}
		driver.findElement(By.cssSelector(".panelTrigger")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	}
}
