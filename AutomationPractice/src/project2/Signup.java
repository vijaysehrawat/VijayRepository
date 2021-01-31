package project2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Signup extends Testbase {
	
	
	@BeforeClass
	 public static void clickSignInLink() {
	  driver.findElement(By.xpath("//*[@id='header']/div[@class='nav']/div/div/nav/div/a")).click();
	  
	}
	@Test(priority=1)
	void verifysignUpPageLoad() {
		
	  String validateCreateAccountscreen= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/form/h3")).getText();
		if (validateCreateAccountscreen.equalsIgnoreCase("CREATE AN ACCOUNT")){
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");				
		}
		
			
	}
	@Test(priority=2)
	public static void verifyIncorrectEmail() {
		
			driver.findElement(By.id("email_create")).sendKeys("xyz");
			driver.findElement(By.name("SubmitCreate")).click();
		
		
		    String invalid= driver.findElement(By.xpath("//*[@id='create_account_error']/ol/li")).getText();
		
			if(invalid.equalsIgnoreCase("Invalid email address.")){
				System.out.println("Passed");
			}
				else {
					System.out.println("Fail");
				}
					
			
		
	}
		 

		
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * openbrowser("http://automationpractice.com/index.php"); clickSignInLink();
	 * verifyIncorrectEmail();
	 * 
	 * 
	 * 
	 * }
	 */
}