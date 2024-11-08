package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_013AddToCompair extends BaseClass {
	
	@Test(groups="integration")
	public void addToCompair() {
		
		String expectedPage = "Demo Web Shop. Compare Products";
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		
		String actualPage = driver.getTitle();

		Assert.assertEquals(actualPage, expectedPage);
		Reporter.log("Product got added for comparing", true);

	}

}
