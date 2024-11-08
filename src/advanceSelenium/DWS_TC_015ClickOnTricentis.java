package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_015ClickOnTricentis extends BaseClass {

	@Test(groups = "smoke")
	public void clickOnTricentis() {

		String expectedurl = "https://www.tricentis.com/solutions/speed";
		driver.findElement(By.id("nivo-slider")).click();
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl, expectedurl);
		Reporter.log("Navigate success to tricentis page", true);

		driver.navigate().back();

	}
}
