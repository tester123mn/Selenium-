package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_TCA_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("seleniumA2@gmail.com");
		lp.getPasswordTextField().sendKeys("selenium@123");
		lp.getLoginButton().click();
		driver.quit();
	}

}
