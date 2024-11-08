package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeMethod_9 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);

		Dimension webelementsize = driver.findElement(By.xpath("//div[text()='Log in']")).getSize();
		System.out.println(webelementsize);
		System.out.println(webelementsize.getHeight());
		System.out.println(webelementsize.getWidth());
	}

}
