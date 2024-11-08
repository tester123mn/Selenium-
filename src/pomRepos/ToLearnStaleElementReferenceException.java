package pomRepos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementReferenceException {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		WebElement usernameTextfield = driver.findElement(By.id("email"));

		// refreshed
		driver.navigate().refresh();

		usernameTextfield.sendKeys("shiva@gmail.com");
		
		driver.quit();
	}

}
