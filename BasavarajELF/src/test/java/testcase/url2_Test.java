package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class url2_Test {

		public WebDriver driver;
		 
		@Test
		public void honda() {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			driver.navigate().to("https://www.honda2wheelersindia.com/");
			driver.close();
			}
		}


