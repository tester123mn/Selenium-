package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParentWindow_5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();//launch browser
		driver.get("https://www.youtube.com/");//open Youtube
		Thread.sleep(3000);//wait for 3 second
		driver.close();//it close parent window but not close the server
	}
}
