package dropDown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/signup");

		// Identify Drop downs
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));

		// use select class
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);

		// Call Methods
		daySelect.selectByIndex(14);
		monthSelect.selectByValue("2");
		yearSelect.selectByVisibleText("2000");

		// To Check
		System.out.println(daySelect.isMultiple());
		System.out.println(monthSelect.isMultiple());
		System.out.println(yearSelect.isMultiple());

		List<WebElement> allmonth = monthSelect.getOptions();

		for (WebElement month : allmonth) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(2000);
		}

	}

}
