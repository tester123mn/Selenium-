package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethode_4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);

		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.clear();
		Thread.sleep(2000);
		usernametextfield.sendKeys("shiva");

		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.clear();
		Thread.sleep(3000);
		passwordtextfield.sendKeys("aa");
	}

}
