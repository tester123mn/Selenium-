package webdriver_methods;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods_8 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		 to get open a application
		 driver.navigate().to("https;//www.instagram.com/");

//		 to get open a application
		driver.navigate().to(new String("https://www.youtube.com/"));

		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

		Navigation nav = driver.navigate();

		nav.back();// empty browser
		Thread.sleep(2000);

		nav.forward();// facebook
		Thread.sleep(2000);

		nav.refresh();// refresh

	}

}
