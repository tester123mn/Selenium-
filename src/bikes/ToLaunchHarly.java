package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHarly {

	@Test(groups = "smoke")
	public void access() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("Harly got executed", true);
		driver.quit();
	}
}
