package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseEnabledAtributes {
	@Test(enabled = false)
	public void cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);
		driver.quit();
	}

	@Test(enabled = true)
	public void baskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://order.baskinrobbins.com/store-selection");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}

	@Test(enabled = false)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();
	}

}
