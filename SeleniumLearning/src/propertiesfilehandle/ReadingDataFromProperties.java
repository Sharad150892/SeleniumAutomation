package propertiesfilehandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadingDataFromProperties {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\shara\\eclipse-workspace\\SeleniumLearning\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fileinput);
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		driver.navigate().to(prop.getProperty("url1"));
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username1"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password1"));
		driver.findElement(By.id("login-button")).click();
		driver.navigate().back();
		driver.navigate().back();
	}
}
