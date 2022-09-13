package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserlaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//*[@class='panelTrigger']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		driver.close();	
		
	}

}
