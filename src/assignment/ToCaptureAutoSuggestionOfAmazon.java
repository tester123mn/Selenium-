package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAutoSuggestionOfAmazon {

	public static void main(String[] args) throws InterruptedException {


	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	 driver.get("https://www.amazon.com/");
	 
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi");
	 Thread.sleep(3000);
	 List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	 for(WebElement ele :autoSuggestion) {
		 System.out.println(ele.getText());
 
	 }
	 
	}

}
