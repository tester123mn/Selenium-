package advanceSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_001Book extends BaseClass {

	@Test(groups = "smoke")
	public void toCheckBookPage() {

		String expectedPage = "Demo Web Shop. Books";

		driver.findElement(By.partialLinkText("Books")).click();
		String actualPage = driver.getTitle();

		assertEquals(actualPage, expectedPage);

		Reporter.log("Navigated Successfully to Books Page", true);

	}

}
