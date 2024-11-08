package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// switch to frame
		driver.switchTo().frame("login_page");

		driver.findElement(By.linkText("CONTINUE")).click();

		// handle popup
		Alert alretpopup = driver.switchTo().alert();
		System.out.println(alretpopup.getText());

		// for press ok button

		alretpopup.accept();

	}

}
