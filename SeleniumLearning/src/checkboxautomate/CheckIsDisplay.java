package checkboxautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsDisplay {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#signup-button input")).click();
		
		boolean check = driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isDisplayed();
		driver.findElement(By.cssSelector("table.p td input#sex")).click();
		boolean check1 = driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isDisplayed();
		System.out.println(check);
		System.out.println(check1);
	}

}
