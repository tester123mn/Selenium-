package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_009ElectronicsDropdown extends BaseClass {

	@Test(groups = "system")
	public void electronicsDropdown() {

		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));

		Select selectsort = new Select(sortby);
		selectsort.selectByVisibleText("Name: Z to A");

	}

}
