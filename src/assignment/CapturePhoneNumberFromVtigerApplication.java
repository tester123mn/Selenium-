package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapturePhoneNumberFromVtigerApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.vtiger.com/");
		WebElement company = driver.findElement(By.partialLinkText("Company"));

		Actions action = new Actions(driver);
		action.moveToElement(company).perform();

		driver.findElement(By.partialLinkText("Contact")).click();

		WebElement phoneno = driver.findElement(By.xpath("//p[contains(text(),'9243602352')]"));
		System.out.println(phoneno.getText());

	}

}
