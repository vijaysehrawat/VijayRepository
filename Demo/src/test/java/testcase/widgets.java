package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class widgets extends Testbase {
    @Test(priority=1)
	void accordian() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[1]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,400)");
		 driver.switchTo().frame(0);
	     driver.findElement(By.id("ui-id-3")).click();
	     driver.findElement(By.id("ui-id-7")).click();
	     driver.findElement(By.id("ui-id-5")).click();
	     driver.switchTo().parentFrame();
	     
    
    }
    
    @Test(priority=2)
     void autocomplete() {
    	 
    	 driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[2]/a")).click();
    	 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,400)");
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//*[@class='ui-autocomplete-input']")).sendKeys("A");
		 
		 List <WebElement> abc = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		 int x= abc.size();
		 System.out.println(x);
		 for(int i=1;i<x;i++) {
			 String txt= abc.get(i).getText();
			 // System.out.println(abc.get(i).getText());
			 if (txt.equalsIgnoreCase("BASIC")) {
				 abc.get(i).click();
			 }
			 
		 }
		 driver.switchTo().parentFrame();
    }
		 @Test(priority=3)
		 void checkboxradio() {
			 
			 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[4]/a")).click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;  
			 js.executeScript("window.scrollBy(0,400)");
			 driver.switchTo().frame(0);
			 WebElement  a= driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]/span[1]"));
			 WebElement b= driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[1]/span[1]"));
			 WebElement c= driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]"));
			 WebElement d= driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]/span[1]"));
			 WebElement e= driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[1]/span[1]"));
			 WebElement f= driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[2]/span[1]"));
			 WebElement g= driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[1]"));
			 a.click();
			 b.click();
			 c.click();
			 d.click();
			 e.click();
			 f.click();
			 g.click();
			 driver.switchTo().parentFrame();
			 
		 }
		@Test(priority=4)
     void selectmenu() throws InterruptedException {
			
    	 driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[10]/a")).click();
    	 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,600)");
    	 driver.switchTo().frame(0);
    	 ////Select sel = new Select(driver.findElement(By.xpath("//*[@id='speed']")));
    	//sel.selectByIndex(2);
    	 driver.findElement(By.xpath("//*[@id='speed-button']")).click();
    	 List <WebElement> abc = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		 int x= abc.size();
		 System.out.println(x);
		 for(int i=0;i<x;i++) {
			 //abc.get(i).click();
			 String txt= abc.get(i).getText();
			 System.out.println(abc.get(i).getText());
			 if (txt.equals("Fast")) {
				 //Thread.sleep(3000);
				Actions act= new Actions(driver);
				act.moveToElement(abc.get(i)).click().perform();
				 //abc.get(i).click();
			 }
			 
		 }
		//Select sel = new Select(driver.findElement(By.id("files-button")));
		//sel.selectByValue("ui.jQuery.js");;
		 driver.findElement(By.xpath("//*[@id=\"files-button\"]")).click();
		 List <WebElement> def= driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		 int y = def.size();
		 System.out.println(y);
		 for(int j=0;j<y;j++)
		 {
		
			 String text = def.get(j).getText();
			 System.out.println(text);
			 if(text.equals("ui.jQuery.js")) {
			 Actions act = new Actions(driver);
			 act.moveToElement(def.get(j)).click().perform();
			 
			 
		 }
		 }
		 driver.switchTo().parentFrame();
     }
		@Test(priority=5)
		void controlgroup() {
			driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[5]/a")).click();
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			driver.switchTo().frame(0);
			
		WebElement abc=driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]"));
		abc.click();
		
		driver.findElement(By.xpath("//*[@id='ui-id-8-button']")).click();
		List <WebElement> def = driver.findElements(By.xpath("//*[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']/ul/li"));
		
		int j= def.size();
		System.out.println(j);
		 
		for(int i=1;i<j;i++) {
			 
			String xyz= def.get(i).getText();
			System.out.println(xyz);
			if (xyz.equals("Luxury")) {
				Actions act = new Actions(driver);
			act.moveToElement(def.get(i)).click().perform();
			}
			
			
		 }

		driver.switchTo().parentFrame();	
			
		}
}
