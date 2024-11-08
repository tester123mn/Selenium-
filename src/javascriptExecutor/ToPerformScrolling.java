package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrolling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("flower", Keys.ENTER);
//		driver.findElement(By.xpath("//div[text()='Images']")).click();

		// to use JavascriptExecutor
		JavascriptExecutor ja = (JavascriptExecutor) driver;

//		for (;;) {
//			try {
//				driver.findElement(By.xpath("//div[text()='Red Rose Flower at Rs 20/piece ...']")).click();
//				break;
//			} catch (Exception e) {
//				ja.executeScript("window.scrollBy(0,500)");
//			}
//		}

		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		WebElement indiaFlag = driver.findElement(By.xpath("//div[text()='India']"));
		ja.executeScript("arguments[0].scrollIntoView(false)", indiaFlag);

	}

}
