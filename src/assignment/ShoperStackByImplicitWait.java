
package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoperStackByImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));

		driver.get("https://www.shoppersstack.com/products_page/23");

		driver.findElement(By.id("Check Delivery-label")).sendKeys("655653");
		driver.findElement(By.id("Check")).click();// need explicitwait
	}

}
