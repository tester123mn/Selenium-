package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator_1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("shiva@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("mn123");
		Thread.sleep(2000);
		driver.quit();
	}

}
