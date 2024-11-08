package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_012AddAddress extends BaseClass {

	@Test(groups = "system")
	public void addAddress() {

		String expactedpage = "Demo Web Shop. Account";

		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("iron");
		driver.findElement(By.id("Address_LastName")).sendKeys("man");
		driver.findElement(By.id("Address_Email")).sendKeys("ironman@123gmail.com");
		driver.findElement(By.id("Address_Company")).sendKeys("qspider");
		WebElement country = driver.findElement(By.id("Address_CountryId"));
		Select countrydropdown = new Select(country);
		countrydropdown.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("bengaluru");
		driver.findElement(By.id("Address_Address1")).sendKeys("marathahalli");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("560037");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("8574965214");
		driver.findElement(By.xpath("//input[@value='Save']")).click();

		String actualpage = driver.getTitle();

		Assert.assertEquals(actualpage, expactedpage);
		Reporter.log("Address got saved successfully", true);

	}

}
