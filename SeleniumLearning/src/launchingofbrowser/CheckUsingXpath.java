package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUsingXpath {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("User Management")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Goutam.Ganesh']//parent::td//parent::tr//input")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//*[@id='resultTable']/"
				+ "/tbody//tr//td//a[text()='Goutam.Ganesh']
				//parent::td//parent::tr//input")).click();*/
		driver.findElement(By.xpath("//a[text()='Goutam.Ganesh']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
