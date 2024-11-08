package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/registration/createAccount?");

		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();

		// Action class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.id("resumeUpload")).sendKeys("W:\\Resume sdet\\mrutunjay resume.pdf");

	}

}
