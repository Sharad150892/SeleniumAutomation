package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
		
		
		
	}
	
	
	
	
}
