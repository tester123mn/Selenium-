package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToQuitWebPage_6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();//launch browser
		driver.get("https://www.youtube.com/");//open Youtube
		Thread.sleep(3000);//wait for 3 second
		driver.quit();//it close web page and server
	}
}
