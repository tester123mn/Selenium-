package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitrelOfPolarbearAppliocation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://polarbear.co.in/");
		String titleOfWebPage = driver.getTitle();
		System.out.println(titleOfWebPage);
		driver.quit();
	}

}
