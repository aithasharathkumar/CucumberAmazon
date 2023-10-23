package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {

public static WebDriver driver;
	
	@Before(order = 0)
	public void Openbrowser() {
		
		driver = new ChromeDriver();
	}
	
	@Before(order =1)
	public void managebrowserwindow() {
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	
	@Before(order = 2)
	public void Openwebpage() {
		driver.get("https://www.amazon.in/");
	}
	
	@After
	public void CloseBrowser() {
		driver.close();
	}
	
}