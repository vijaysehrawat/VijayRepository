package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Interactions extends Testbase {
	
	public Actions act;
	
	
	
	@Test(priority=1)
	void drag() {
		
		//browser= "chrome";
		driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li/a")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,200)");
		act= new Actions(driver);
		
		
		
		driver.switchTo().frame(0);
		WebElement ele= driver.findElement(By.xpath("//*[@id='draggable']/p"));
		act.dragAndDropBy(ele, 200, 80).build().perform();
		driver.switchTo().parentFrame();
		
			
	}
    @Test(priority=2)
	void droppable() {
    	
    	driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[2]/a")).click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,200)");
    	act= new Actions(driver);
		//act1.clickAndHold(driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[2]/a"))).moveToElement(driver.findElement(By.id("droppable"))))
		
		driver.switchTo().frame(0);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.switchTo().parentFrame();
		
	}
    @Test(priority=3)
    void resizable() {
    	driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[3]/a")).click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,200)");
    	 act= new Actions(driver);
    	 driver.switchTo().frame(0);
    	 act.clickAndHold(driver.findElement(By.xpath("//*[@id='resizable']/div[3]"))).moveByOffset(100, 50).release().perform();
    	 driver.switchTo().parentFrame();
    }
     @Test(priority=4)	
     void selectable() {
    	 
    	 driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[4]/a")).click();
    	 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,200)");
    	 act= new Actions(driver);
    	 driver.switchTo().frame(0);  
    	 act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//*[@id='selectable']/li[1]"))).click(driver.findElement(By.xpath("//*[@id='selectable']/li[2]"))).keyUp(Keys.CONTROL).build().perform();
		 
    	 //act.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("//*[@id='selectable']/li[1]"))).click(driver.findElement(By.xpath("//*[@id='selectable']/li[2]"))).keyUp(Keys.SHIFT).build().perform();

    	 //act.keyDown(driver.findElement(By.xpath("//*[@id='selectable']/li[1]")), Keys.SHIFT).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyUp(Keys.SHIFT).build().perform();
    	 driver.switchTo().parentFrame();
     }
     @Test(priority=5)	
     void sortable() {
    	 
    	 driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[5]/a")).click();
    	 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,200)");
		 act= new Actions(driver);
		 driver.switchTo().frame(0);
		 //act.dragAndDrop(driver.findElement(By.xpath("//*[@id='sortable']/li[1]/span")), driver.findElement(By.xpath("//*[@id='sortable']/li[2]/span"))).build().perform();
		 act.clickAndHold(driver.findElement(By.xpath("//*[@id='sortable']/li[1]/span"))).moveByOffset(0, 90).release().perform();
		 driver.switchTo().parentFrame();
     }
}
