package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseClickAndHoldAndRelease {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("24536");

		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		// To use action class
		Actions ref = new Actions(driver);
		ref.clickAndHold(eyeicon).perform();
		Thread.sleep(3000);
		ref.release(eyeicon).perform();
		}
    }
