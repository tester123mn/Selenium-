package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySongInYoutube {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search_query")).sendKeys("baby baby all right");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("video-title")).click();

	}

}
