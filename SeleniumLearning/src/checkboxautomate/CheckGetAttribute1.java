package checkboxautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGetAttribute1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#signup-button input")).click();
		
		String output = driver.findElement(By.xpath("//*[@name='firstname']")).getAttribute("name");
		System.out.println(output);
	}

}
