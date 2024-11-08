package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyalEnfield {

	@Test(groups = "integration")
	public void access() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/financepage-india/");
		Reporter.log("Royal got executed", true);
		driver.quit();
	}
}
