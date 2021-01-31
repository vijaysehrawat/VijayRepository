
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Interactions extends TestBase {
	
	@Test
	void drag() {
		
		driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li/a")).click();
		
		
	}

}
