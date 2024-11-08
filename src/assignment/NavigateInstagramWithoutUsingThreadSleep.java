package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInstagramWithoutUsingThreadSleep {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		//without implicit wait we get exception
		driver.findElement(By.name("username")).sendKeys("sdfhsao");
		driver.findElement(By.name("password")).sendKeys("sdhas");
	}

}
