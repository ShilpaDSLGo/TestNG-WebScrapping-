package RecipeScrapping;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 WebDriver driver;

	
	@BeforeTest
	public  void driver_intial(){
		
		System.setProperty("webdriver.driver.chromedriver", "C:/Users/shilp/OneDrive/Documents/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.tarladalal.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(driver.getCurrentUrl());
	
	}

	
//	@AfterTest
//	public  void Quit_driver() {
//		driver.quit();
//	}
}

