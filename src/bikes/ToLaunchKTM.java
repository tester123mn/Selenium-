package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKTM {

	@Test(groups = "integration")
	public void access() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktmindia.com/ktm-bikes/naked-bike/k");
		Reporter.log("KTM got executed", true);
		driver.quit();
	}

}
