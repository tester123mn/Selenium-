package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_010PopularTags extends BaseClass {

	@Test(groups = "integration")
	public void popularTags() {

		String expectedTitle = "Demo Web Shop. Vintage Style Three Stone Diamond Engagement Ring";

		driver.findElement(By.linkText("awesome")).click();

		for (;;) {
			try {
				driver.findElement(By.linkText("Vintage Style Three Stone Diamond Engagement Ring")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.linkText("Next")).click();
			}
		}
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

		Reporter.log("Engagement Ring got selected successfully", true);

	}

}
