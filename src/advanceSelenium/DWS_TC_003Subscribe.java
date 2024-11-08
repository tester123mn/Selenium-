package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_003Subscribe extends BaseClass {

	@Test(groups = "smoke")
	public void toCheckBookPage() {

		String expectedMessage = "";

		driver.findElement(By.id("newsletter-email")).sendKeys("seleniumA2@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		String actualMessage = driver.findElement(By.id("newsletter-result-block")).getText();

		Assert.assertEquals(actualMessage, expectedMessage);

		Reporter.log("Subscribe successfull", true);
	}

}
