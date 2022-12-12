package testcase;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;



	public class url1_Test{
		public WebDriver driver;
	 
	@Test
	public void royalenfield() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.royalenfield.com/");
		driver.close();
		}
	}

