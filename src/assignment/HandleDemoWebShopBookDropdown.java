package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDemoWebShopBookDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Book")).click();

		WebElement dropdown = driver.findElement(By.id("products-orderby"));

		Select bookSelect = new Select(dropdown);
		bookSelect.selectByVisibleText("Price: Low to High");

		System.out.println(bookSelect.isMultiple());


	}
}
