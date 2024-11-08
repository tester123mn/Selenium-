package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfZomatoLogo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		File temp = driver.findElement(By.xpath("//div[@height='6rem']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/zomatologo2.png");
		FileHandler.copy(temp, src);

		driver.quit();
	}

}
