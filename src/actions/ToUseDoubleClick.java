package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training\r\n");

		WebElement addbutton = driver.findElement(By.id("add"));

		// To use action class
		Actions ref = new Actions(driver);
		Thread.sleep(2000);

		ref.doubleClick(addbutton).perform();

	}

}
