package advanceSelenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;

	String expectedHomePageTitle = "Demo Web Shop";

	@Parameters("browser")

	@BeforeClass(groups = { "system", "integration", "smoke" })
	public void toLaunch(@Optional("chrome") String bName) {

		if (bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (bName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		Reporter.log("Browser got launched successfully");
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@BeforeMethod(groups = { "system", "integration", "smoke" })
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualHomePageTitle = driver.getTitle();

		assertEquals(actualHomePageTitle, actualHomePageTitle);
		Reporter.log("Navigated Successfully to Demo Web Shop", true);

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("seleniumA2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Logged In Successfully", true);
	}

	@AfterMethod(groups = { "system", "integration", "smoke" })
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out successfully", true);
	}

	@AfterClass(groups = { "system", "integration", "smoke" })
	public void toClose() {
		Reporter.log("Browser got closed successfully");
		driver.quit();

	}

}
