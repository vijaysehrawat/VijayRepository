import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	static WebDriver driver;
	
	
    @BeforeTest
	void openBrowser() {
    	WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		
	}
}

