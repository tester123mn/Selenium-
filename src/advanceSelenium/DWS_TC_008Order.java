package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_008Order extends BaseClass {

	@Test(groups = "system")
	public void order() {

		String expectedpage = "Demo Web Shop. Checkout";

		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.xpath("//h1[@itemprop='name']/../..//input[@id='add-to-cart-button-14']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

//		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("bengraluru");
//		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("marathahali");
//		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560037");
//		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("08917650032");

		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

		String actualpage = driver.getTitle();

		Assert.assertEquals(actualpage, expectedpage);
		Reporter.log("Order got palaced successfull", true);

	}

}
