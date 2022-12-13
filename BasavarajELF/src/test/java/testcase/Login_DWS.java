package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login_DWS {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),\"Log\")]")).click();
		driver.findElement(By.xpath("((//input[contains(@name,'Email')])[2])/../input")).sendKeys("chethu123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9902350966");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		driver.close();
	}
}
