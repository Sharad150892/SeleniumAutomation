package launchingofbrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

  /**
 * @author Sharad Sahu
 * @description
 * @date 26-Jul-2022 4:52:46 pm
 */

public class ChromeBrowserlaunch {
	
	public static void main(String[] args) throws InterruptedException	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		String txturl = driver.getCurrentUrl();
		System.out.println(txturl);
		String txtTitle = driver.getTitle();
		System.out.println(txtTitle);
		driver.close();
		//driver.quit();		
	}

}
