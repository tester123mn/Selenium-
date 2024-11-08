package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConformationPopups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://licindia.in/?");

		driver.findElement(By.partialLinkText("Login")).click();

		// handle confirmation popup
		Alert conformationpopup = driver.switchTo().alert();
		System.out.println(conformationpopup.getText());

		//conformationpopup.accept();// ok button

		conformationpopup.dismiss();// cancle button

	}

}
