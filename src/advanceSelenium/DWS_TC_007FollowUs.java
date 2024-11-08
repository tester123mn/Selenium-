package advanceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_007FollowUs extends BaseClass {

	@Test(groups = "integration")
	public void toCheckBookPage() {

		String expectedurl = "https://www.facebook.com/nopCommerce";

		String parantId = driver.getWindowHandle();

		driver.findElement(By.linkText("Facebook")).click();

		Set<String> allId = driver.getWindowHandles();
		allId.remove(parantId);

		for (String o : allId) {
			driver.switchTo().window(o);
			String actualurl = driver.getCurrentUrl();
			Assert.assertEquals(actualurl, expectedurl);
			Reporter.log("followus page got launched successfully", true);
		}
		String parent2 = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent2);
		for (String a : allwindow) {
			driver.switchTo().window(a);
		}

	}

}
