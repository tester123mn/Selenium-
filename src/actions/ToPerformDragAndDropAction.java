package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// To Switch frame
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		// identify image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

		// identify trash
		WebElement trash = driver.findElement(By.id("trash"));

		// identify gallery
		WebElement gallery = driver.findElement(By.id("gallery"));

		// to drag image to trash box
		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		Thread.sleep(2000);
		//action.dragAndDrop(image2, trash).perform();
		action.dragAndDropBy(image2, 300, 0).perform();// drag and drop by method
		Thread.sleep(2000);
		//action.dragAndDrop(image3, trash).perform();
		action.clickAndHold(image3).moveToElement(trash).release().perform();// 3 method 
		Thread.sleep(2000);
		action.dragAndDrop(image4, trash).perform();
		Thread.sleep(2000);

		// to drag image to gallery box
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();

	}

}
