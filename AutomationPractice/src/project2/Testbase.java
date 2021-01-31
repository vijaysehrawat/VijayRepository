package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testbase {
	 public static WebDriver driver;
	//public static ChromeDriver driver;
	//public static FirefoxDriver abc;
	 
    @BeforeTest
	public static void openbrowser() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\eclipse-workspace\\LearningJava\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		//WebDriver driver=new WebDriver();
		//WebDriver driver1=new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		
		
		
		
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * openbrowser("http://automationpractice.com/index.php");
	 * 
	 * 
	 * }
	 */

    
     
      
}