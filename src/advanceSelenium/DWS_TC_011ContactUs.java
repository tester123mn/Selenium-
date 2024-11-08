package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_011ContactUs extends BaseClass {

	@Test(groups = "system")
	public void contactUs() {

		String expectedMessage = "Your enquiry has been successfully sent to the store owner.";

		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.id("Enquiry")).sendKeys("How to plase order");
		driver.findElement(By.name("send-email")).click();

		String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();

		Assert.assertEquals(actualMessage, expectedMessage);
		Reporter.log("Enquairy sent successfully", true);
	}

}
