package tablehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Sharad Sahu
 * @description
 * @date 02-Aug-2022 11:21:32 am
 */
public class HandleIrctc {
	
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.findElement(By.xpath("//*[@id='jDate']//input")).click();
		Thread.sleep(1000);
		int i = 0;
		while (i==0) {
			String year = driver.findElement(By.xpath("//*[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			if (!(year.equals("November")))		//no back date allow in IRCTC and more than 3 month reservation not allow
				driver.findElement(By.xpath("//*[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			else
				break;
		}
		
		List<WebElement> day = driver.findElements(By.xpath("//tbody//tr//td//a"));
		for(WebElement date:day)
			if(date.getText().equals("12"))
				date.click();
			}
}
