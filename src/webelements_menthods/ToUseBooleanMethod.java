package webelements_menthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseBooleanMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.instagram.com/");
//		Thread.sleep(4000);
//		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//		System.out.println("before entering Data");
//		System.out.println(loginbutton.isDisplayed());
//		System.out.println(loginbutton.isEnabled());
//		System.out.println("===============================");
//		System.out.println("After entering data");
//		driver.findElement(By.name("username")).sendKeys("ifjgoeir");
//		driver.findElement(By.name("password")).sendKeys("12345678");
//		System.out.println(loginbutton.isDisplayed());
//		System.out.println(loginbutton.isEnabled());

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//option[@value='90']"));
		System.out.println("before selecting");
		System.out.println(element.isSelected());
		System.out.println("after seclecting");
		element.click();
		System.out.println(element.isSelected());

	}

}
