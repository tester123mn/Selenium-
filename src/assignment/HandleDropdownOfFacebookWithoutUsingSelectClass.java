package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownOfFacebookWithoutUsingSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/signup");

		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value='15' and text()='15']")).click();

		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[@value='2' and text()='Feb']")).click();

		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[@value='2000' and text()='2000']")).click();

		driver.findElement(By.id("password_step_input")).click();

	}

}
