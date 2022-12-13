package testcase;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;



	public class register_DWS{
		
	 
		@Test
		public void register() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("CHETHAN");
			driver.findElement(By.id("LastName")).sendKeys("KUMAR HM");
			driver.findElement(By.name("Email")).sendKeys("chethu1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("99023509666");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("99023509666");
			driver.findElement(By.cssSelector("input[id=register-button]")).click();
		}
	}

