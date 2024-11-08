package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeOfDream11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("8917650033");

		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();

	}

}
