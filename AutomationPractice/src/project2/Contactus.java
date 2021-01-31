package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Contactus extends Testbase {
	
	@BeforeClass
	void contactuslink() {
		driver.findElement(By.xpath("//*[@id='contact-link']")).click();
		
	}
	
	@Test(priority=1)
	static void contactScreen() {
		
		String validateContactUsscreen= driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
				if (validateContactUsscreen.equalsIgnoreCase("CUSTOMER SERVICE - CONTACT US")){
					System.out.println("Passed");
				}else {
					System.out.println("Failed");

				}
	}
	@Test(priority=2)	
	static void sendMessage() {
					Select subject= new Select(driver.findElement(By.id("id_contact")));
					subject.selectByVisibleText("Customer service");
					
					driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
					driver.findElement(By.id("id_order")).sendKeys("12345");
					driver.findElement(By.id("message")).sendKeys("Bad Quality Item123");
					driver.findElement(By.id("submitMessage")).click();
					
					String validateSendEmail= driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
					if(validateSendEmail.equalsIgnoreCase("Your message has been successfully sent to our team.")) {
						System.out.println("Message Sent Verified");
					}else {
						System.out.println("Message didn't appear");
					}
				}
		
		
	
	
	

//	public static void main(String[] args) throws InterruptedException {
//	      openbrowser("http://automationpractice.com/index.php");
//
//		contactScreen();
//		sendMessage();
//		
//		
//	}
	
}
