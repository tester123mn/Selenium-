package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTOSwitchMethod_11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("URL");
		Thread.sleep(2000);

		String ParentId = driver.getWindowHandle();

		driver.findElement(By.xpath("input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);

		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(ParentId);
		System.out.println(allwindowIds);

		for (String id : allwindowIds) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(2000);

		}

	}

}
