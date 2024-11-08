package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_004SearchProduct extends BaseClass {

	@Test(groups = "smoke")
	public void toCheckBookPage() {

		String expectedPage = "Demo Web Shop. Search";

		driver.findElement(By.id("small-searchterms")).sendKeys("smartphone");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		String actualPage = driver.getTitle();

		Assert.assertEquals(actualPage, expectedPage);

		Reporter.log("Product got Search Successfully ", true);

	}

}
