package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumInInstagram {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.instagram.com/");

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("mrutunjay");
		username.sendKeys(Keys.CONTROL + "a");
		username.sendKeys(Keys.CONTROL + "c");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Keys.CONTROL + "v");

	}

}
