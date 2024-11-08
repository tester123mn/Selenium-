package dropDown_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/");

//		 Identify List box
		WebElement listBox = driver.findElement(By.id("cars"));

//		 select class
		Select multiSelect = new Select(listBox);

//		 call method
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("99");
		Thread.sleep(2000);

//		multiSelect.deselectByIndex(0);
//		multiSelect.deselectByValue("99");

		multiSelect.deselectAll();
	}

}
