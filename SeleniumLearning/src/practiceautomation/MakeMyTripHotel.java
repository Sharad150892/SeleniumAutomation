package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripHotel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().window().maximize();

		WebElement city = driver.findElement(By.xpath("//*[@id='city']//ancestor::label"));
		city.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(city, "Singapore").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Little India, Singapore']")).click();
		Thread.sleep(2000);
		int i = 0;
		while (i == 0) {
			String monthyear = driver
					.findElements(
							By.xpath("//*[@class='DayPicker-Caption']//div")).get(0).getText();
			if (!(monthyear.equalsIgnoreCase("October")))
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			else
				break;
		}
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div/div"));
		for(WebElement date:dates)
			if(date.getText().equals("18"))
				date.click();

	}

}
