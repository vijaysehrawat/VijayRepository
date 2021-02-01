package testcase;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	//ChromeDriver driver;
	//FirefoxDriver driver1;
	
	static WebDriver driver;
	static String browser="";
	static String url="";
  
	@BeforeTest
	static void openBrowser() throws InterruptedException, IOException {
		
       //properties abc = new properties("C:\\Users\\Vijay\\eclipse-workspace\\Demo\\properties");
       properties abc = new properties(System.getProperty("user.dir")+"\\properties");
       browser=abc.getProperty("Browser");
       System.out.println(browser);
       url=abc.getProperty("Url");
       System.out.println(url);
       
       
       
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
		//Thread.sleep(2000);
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	
	}
	
//	public static void main(String args[]) throws InterruptedException {
//		openBrowser("edge");
//	}
}
