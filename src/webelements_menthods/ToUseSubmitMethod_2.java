package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod_2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("username")).sendKeys("hfslfjh");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("fhie");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
