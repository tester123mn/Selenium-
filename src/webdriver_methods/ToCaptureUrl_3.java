package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl_3 {
	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// open youTube
		driver.get("https://www.youtube.com/");

		// capture url
		String urlOfWebPage = driver.getCurrentUrl();
		// print url

		System.out.println(urlOfWebPage);
	}

}
