package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_006Myaccount extends BaseClass {

	@Test(groups = "integration")
	public void toCheckBookPage() {

		String expectedaccountPageTitle = "Demo Web Shop. Account";

		driver.findElement(By.partialLinkText("My account")).click();
		String actualaccountPageTitle = driver.getTitle();

		Assert.assertEquals(actualaccountPageTitle, expectedaccountPageTitle);
		Reporter.log("Navigated Successfully to My account page", true);

	}

}
