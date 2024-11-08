package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchAccess {

	@Test(groups = "smoke")
	public void access() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.suzukimotorcycle.co.in/");
		Reporter.log("Access got excuted", true);
		driver.quit();
	}
}
