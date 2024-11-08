package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetOpenTheApp_1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//to launch empty browser and start server
		driver.get("https://www.linkedin.com/home?originalSubdomain=in");//for launch linkedin
	}

}
