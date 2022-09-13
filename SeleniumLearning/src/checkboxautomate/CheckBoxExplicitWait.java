package checkboxautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxExplicitWait {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement check = driver.findElement(By.cssSelector("#checkbox"));
		check.click();
		//Explicit Wait
		WebElement check1 = driver.findElement(By.cssSelector("#ch"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(check1));
		
		boolean check2 = driver.findElement(By.cssSelector("#ch")).isSelected();
		System.out.println(check2);
	}
}
