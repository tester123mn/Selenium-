package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId_9 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);
	}

}
