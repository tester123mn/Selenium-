package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_002ComputerAccessories extends BaseClass {

	@Test(groups = "smoke")
	public void toCheckBookPage() {

		String expectedPage = "Demo Web Shop. Accessories";

		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Accessories")).click();
		String actualPage = driver.getTitle();

		Assert.assertEquals(actualPage, expectedPage);

		Reporter.log("Navigated Successfully to Accessories Page", true);
	}

}
