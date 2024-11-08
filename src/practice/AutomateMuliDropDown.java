package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateMuliDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multi = driver.findElement(By.id("cars"));
		Select multiDrop=new Select(multi);
		Thread.sleep(2000);

		multiDrop.selectByValue("99");
		Thread.sleep(2000);

		multiDrop.selectByValue("199");
		Thread.sleep(2000);

		multiDrop.selectByValue("399");
		Thread.sleep(2000);

		multiDrop.deselectByValue("99");
		Thread.sleep(2000);
		multiDrop.deselectAll();
	}

}
