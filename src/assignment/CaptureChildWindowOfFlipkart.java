package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureChildWindowOfFlipkart {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
		driver.get("https://www.flipkart.com/search?");
		
		//capture parent session id
		String parentWindoId = driver.getWindowHandle();

		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();

		//remove parent window
		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(parentWindoId);

		//for switch driver controlar
		for (String id : allwindowIds) {
			driver.switchTo().window(id);
		}

		//to take screen shoot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Flipkart child window.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);

	}

}
