package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrlOfYoutube {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String urlOfWebPage = driver.getCurrentUrl();
		System.out.println(urlOfWebPage);
		driver.quit();

	}
}
