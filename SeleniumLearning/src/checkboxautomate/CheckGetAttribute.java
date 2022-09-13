package checkboxautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sharad Sahu
 * @description
 * @date 02-Aug-2022 6:42:46 pm
 */
public class CheckGetAttribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		Thread.sleep(4000);

		WebElement checkbox = driver.findElement(By.xpath(
				"//*[text()='Desktop']//ancestor::label//span[@class='rct-checkbox']//*[@class='rct-icon rct-icon-uncheck']"));
		checkbox.click();

		WebElement checkbox1 = driver.findElement(By.xpath(
				"//*[text()='Desktop']//ancestor::label//span[@class='rct-checkbox']//*[@class='rct-icon rct-icon-check']"));
		
		Thread.sleep(3000);
		String attvalue = checkbox1.getAttribute("class");
		if(attvalue.contains("-check"))
			System.out.println("Checkbox is Selected");
		else
			System.out.println("Checkbox is not Selected");
	}
}










