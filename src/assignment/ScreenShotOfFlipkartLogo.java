package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfFlipkartLogo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		File temp = driver.findElement(By.xpath("//img[@title='Flipkart']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Flipkartlogo.png");
		FileHandler.copy(temp, src);
		driver.quit();
	}

}
