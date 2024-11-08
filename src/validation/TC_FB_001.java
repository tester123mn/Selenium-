package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB_001 {

	public static void main(String[] args) {

		String ExpectedUsername = "Siba@gmail.com";
		String Expectedpassword = "123456";
		String ExpectedLoginPageTitle = "Facebook – log in or sign up";

		// Step 1:-Open browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got Launched");
		driver.manage().window().maximize();
		System.out.println("Browser got Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 2:-Enter the URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(ExpectedLoginPageTitle)) {
			System.out.println("Successfully navigated to Facebook Login page");
		} else {
			System.out.println("Failed to navigated to Facebook Login page");
		}

		// Step 3:-Enter User name
		WebElement userTextField = driver.findElement(By.id("email"));
		userTextField.clear();
		userTextField.sendKeys(ExpectedUsername);
		String actuleUsername = userTextField.getAttribute("value");
		if (actuleUsername.equals(ExpectedUsername)) {
			System.out.println("UsernameTextfield successfully accept data");
		} else {
			System.out.println("UsernameTextfield failed to accept data");

		}

		// Step 4:-Enter password
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys(Expectedpassword);
		String actulePassword = passwordTextField.getAttribute("value");
		if (actulePassword.equals(Expectedpassword)) {
			System.out.println("PasswordTextfield successfully accept data");
		} else {
			System.out.println("PasswordTextfield failed to accept data");

		}

		// Step 5:-Click on login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("succefully naviget to Home page");

		// Step 6:-Close the Browser
		System.out.println("Browser got close");
		driver.quit();

	}

}
