package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateSingleDropdownInfacebook {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/signup");

		WebElement day = driver.findElement(By.id("day"));

		Select daydropdown = new Select(day);
		daydropdown.selectByValue("15");

		WebElement month = driver.findElement(By.id("month"));

		Select monthdropdown = new Select(month);
		monthdropdown.selectByValue("2");

		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(year);
		yearDropdown.selectByValue("2000");
		
		List<WebElement> allYear = yearDropdown.getOptions();
		for(WebElement w:allYear) {
			System.out.println(w.getText());
		}
		
	}

}
