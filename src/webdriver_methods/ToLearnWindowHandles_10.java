package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowHandles_10 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("URL");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		System.out.println(allwindowIds);

	}

}
