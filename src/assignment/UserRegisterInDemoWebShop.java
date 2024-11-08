package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegisterInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("FirstName")).sendKeys("shiva");
		Thread.sleep(2000);

		driver.findElement(By.id("LastName")).sendKeys("pradhan");
		Thread.sleep(2000);

		driver.findElement(By.id("Email")).sendKeys("mrutunjaypradhan521@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("Password")).sendKeys("shiva@123");
		Thread.sleep(2000);

		driver.findElement(By.id("ConfirmPassword")).sendKeys("shiva@123");
		Thread.sleep(2000);

		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
