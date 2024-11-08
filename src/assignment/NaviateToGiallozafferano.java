package assignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviateToGiallozafferano {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.giallozafferano.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		driver.navigate().back();
//		Thread.sleep(3000);
		
//		driver.navigate().forward();
//		Thread.sleep(3000);

//		driver.navigate().refresh();
//		Thread.sleep(3000);

		Navigation nav = driver.navigate();

		nav.back();
		Thread.sleep(3000);
		nav.forward();

		Thread.sleep(3000);
		nav.refresh();

		Thread.sleep(3000);
		driver.quit();
	}

}
