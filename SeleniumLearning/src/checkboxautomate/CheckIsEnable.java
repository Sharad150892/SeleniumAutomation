package checkboxautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsEnable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/checkbox-disable-demo.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ancestor::tbody//tr//td//input[@value='Disable']")).click();
		
		boolean check = driver.findElements(By.cssSelector("#ck1")).get(0).isEnabled();
		driver.findElement(By.xpath("//ancestor::tbody//tr//td//input[@value='Enable']")).click();
		driver.findElement(By.cssSelector("#ck1")).click();
		boolean check1 = driver.findElements(By.cssSelector("#ck1")).get(0).isEnabled();
		System.out.println(check);
		System.out.println(check1);	
		
		
	}

}
