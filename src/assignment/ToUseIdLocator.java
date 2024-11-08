package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);

		driver.findElement(By.id("FirstName")).sendKeys("shiva");
		Thread.sleep(2000);

		driver.findElement(By.id("LastName")).sendKeys("pradhan");
		Thread.sleep(2000);

		driver.findElement(By.id("Email")).sendKeys("mn@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("Company")).sendKeys("Qspioder");
		Thread.sleep(2000);
		driver.quit();
	}

}
