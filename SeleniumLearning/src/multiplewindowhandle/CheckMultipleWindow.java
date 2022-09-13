package multiplewindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMultipleWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String winId1 = driver.getWindowHandle();
		System.out.println("Primary Window ID: "+winId1);
		
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='h_menu_drop_button hidden-xs']//child::a//i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='HOTELS']//parent::a[@class='a']")).click();
		Thread.sleep(1000);
		Set<String> allwindowhandle = driver.getWindowHandles();
		for (String eachwindow : allwindowhandle)
			System.out.println(eachwindow);
	}
}
