package assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForOpenFacebook {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("test@123");
		driver.findElement(By.id("pass")).sendKeys("123466");
		driver.findElement(By.name("login")).click();
	}

}
