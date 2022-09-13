package actionhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckRightClick {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		driver.manage().window().maximize();
		WebElement target1= driver.findElement(By.xpath("//input[@value='Radio1']"));
		WebElement target2= driver.findElement(By.xpath("//input[@value='Radio2']"));
		WebElement target3= driver.findElement(By.xpath("//input[@value='Radio3']"));
		WebElement target4= driver.findElement(By.xpath("//input[@value='Radio4']"));
		
		Actions act = new Actions(driver);
		act.contextClick(target1).perform();
		Thread.sleep(2000);
		act.contextClick(target2).perform();
		Thread.sleep(2000);
		act.contextClick(target3).perform();
		Thread.sleep(2000);
		act.contextClick(target4).perform();
		
	}

}
