package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCodeOfWebPage_4 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();//launch browser
		driver.get("https://www.youtube.com/");//open Youtube
		String sourceCodeOfWebPage = driver.getPageSource();//capture source code
		System.out.println(sourceCodeOfWebPage);//print source code
	}

}
