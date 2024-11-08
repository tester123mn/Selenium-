package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocationMethod_10 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);

		Point webelementlocation = driver.findElement(By.xpath("//div[text()='Log in']")).getLocation();
		System.out.println(webelementlocation);
		System.out.println(webelementlocation.getX());
		System.out.println(webelementlocation.getY());
	}

}
