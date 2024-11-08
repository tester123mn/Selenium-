package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.woodenstreet.com/");

		driver.findElement(By.id("loginclose1")).click();

		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//div[@aria-describedby='slick-slide20']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();

		driver.findElement(By.linkText("Living")).click();
		driver.findElement(By.xpath("//div[@aria-describedby='slick-slide30']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();

		driver.findElement(By.linkText("Bedroom")).click();
		driver.findElement(By.xpath("//div[@aria-describedby='slick-slide20']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();

	}

}
