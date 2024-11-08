package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DempWebProperties {

	public static void main(String[] args) throws IOException {

		// Create object for file input stream
		FileInputStream fis = new FileInputStream("./testData/demoweb.properties");

		// Create object for property file
		Properties prop = new Properties();

		// call method
		prop.load(fis);
		String URL = prop.getProperty("url");
		String FIRSTNAME = prop.getProperty("firstname");
		String LASTNAME = prop.getProperty("lastname");
		String EMAIL = prop.getProperty("email");
		String PASSWORD = prop.getProperty("password");
		String CONFRIMPASSWORD = prop.getProperty("cfonfirmpassword");

		// script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFRIMPASSWORD);

	}
}
