package alertandpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		String winTd1 = driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> winIdAll = driver.getWindowHandles();
		int noWinIdPresent = winIdAll.size();
		if (noWinIdPresent > 1) {
			for (String singleWinId : winIdAll) {
				if (!(singleWinId.equals(winTd1))) {
					driver.switchTo().window(singleWinId);
					driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abcd@gmil.com");
				}

			}

		} 
		else
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abcd@gmil.com");
	}

}
