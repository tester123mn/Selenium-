package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_005AddProductToCart extends BaseClass {

	@Test(groups = "integration")
	public void addProduct() {

		String expectedconfromEmssage = "The product has been added to your shopping cart";

		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.xpath("//h1[@itemprop='name']/../..//input[@id='add-to-cart-button-14']")).click();
		String actualconfromMessage = driver.findElement(By.xpath("//p[@class='content']")).getText();

		Assert.assertEquals(actualconfromMessage, expectedconfromEmssage);

		Reporter.log("pruduct got add successfully", true);

	}

}
