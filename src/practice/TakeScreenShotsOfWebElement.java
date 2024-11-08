package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotsOfWebElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dream11.com/");
		File temp = driver.findElement(By.xpath("//img[@width='120' and @height='27']"))
				.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Dream11 logo.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);

	}

}
