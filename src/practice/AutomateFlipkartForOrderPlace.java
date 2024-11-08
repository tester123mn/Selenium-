package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateFlipkartForOrderPlace {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// to open browser
		driver.get("https://www.flipkart.com/");
		// to capture parent sessionId
		String parentwindow = driver.getWindowHandle();
		// to enter product name in text field
		driver.findElement(By.name("q")).sendKeys("phone");
		// using action class for press enter key
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		// to click on product
		driver.findElement(By.xpath("//div[text()='vivo V40 Pro 5G (Ganges Blue, 512 GB)']")).click();
		// to capture all session id
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentwindow);
		// to switch driver control
		for (String a : allwindow) {
			driver.switchTo().window(a);
		}
		// to click on product
		driver.findElement(By.xpath("//button[@type='button']")).click();
		// to pass value in number text field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8917650033");
		// to click on continue button
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();

	}

}
