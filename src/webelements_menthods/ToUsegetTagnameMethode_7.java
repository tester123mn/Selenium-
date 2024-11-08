package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetTagnameMethode_7 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);

		String tagnaem = driver.findElement(By.linkText("Try Free")).getTagName();
		System.out.println(tagnaem);
	}

}
