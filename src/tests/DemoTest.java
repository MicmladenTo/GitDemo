package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Test
	public void testing() throws IOException, InterruptedException {
	
	driver.navigate().to("http://cms.demo.katalon.com/");
	Thread.sleep(2000);
	driver.close();
	}
}
