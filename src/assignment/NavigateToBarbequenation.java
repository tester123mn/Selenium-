package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBarbequenation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.barbequenation.com/");
		driver.manage().window().maximize();
	
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);

		String urlOfWebPage = driver.getCurrentUrl();
		System.out.println(urlOfWebPage);

		Dimension sizeofbrowser = driver.manage().window().getSize();
		System.out.println(sizeofbrowser);

		Point pose = driver.manage().window().getPosition();
		System.out.println(pose);

		Thread.sleep(3000);

		driver.quit();

	}

}
