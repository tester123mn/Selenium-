package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@DataProvider(name = "cred")
	public String[][] sendData() {
		
		String sr[][] = {
				          { "shiva@gmail.com", "shiva123" },
				          { "Debasish@gmail.com", "Debashish123" },
				          { "Afrid@gmail.com", "afrid123" }
		                };
		return sr;
	}

	@Test(dataProvider = "cred")
	public void toLogin(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.quit();

	}

}
